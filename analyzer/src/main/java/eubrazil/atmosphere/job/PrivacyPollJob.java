package eubrazil.atmosphere.job;

import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.stereotype.Component;

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttributeView;
import eubr.atmosphere.tma.entity.qualitymodel.ConfigurationProfile;
import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;
import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubr.atmosphere.tma.entity.qualitymodel.Preference;
import eubr.atmosphere.tma.exceptions.UndefinedException;
import eubr.atmosphere.tma.utils.ListUtils;
import eubr.atmosphere.tma.utils.PrivacyScore;
import eubr.atmosphere.tma.utils.TrustworthinessScore;
import eubrazil.atmosphere.config.appconfig.PropertiesManager;
import eubrazil.atmosphere.config.quartz.SchedulerConfig;
import eubrazil.atmosphere.kafka.KafkaManager;
import eubrazil.atmosphere.qualitymodel.SpringContextBridge;
import eubrazil.atmosphere.service.TrustworthinessService;

/**
 * Privacy Poll Job
 * @author JorgeLuiz
 */
@Component
@DisallowConcurrentExecution
@PropertySource(ignoreResourceNotFound = true, value = "classpath:config.properties")
public class PrivacyPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Value("${privacy.configuration.profile.id}")
	private Integer privacyConfigurationProfileID;
	
	@Value("${privacy.quality.model.id}")
	private Integer privacyQualityModelID;
	
	@Value("${privacy.trigger.job.time}")
	private String triggerJobTime;

	private static Date lastTimestampRead = null;
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("PrivacyPollJob - execution..");

		TrustworthinessService trustworthinessService = SpringContextBridge.services().getTrustworthinessService();
		
		List<ConfigurationProfile> configProfileList = trustworthinessService.findConfigurationProfileInstance(privacyConfigurationProfileID);
		if (ListUtils.isEmpty(configProfileList)) {
			LOGGER.error("Configuration Profile not defined in the Knowledge base.");
			return;
		}

		ConfigurationProfile configurationActor =  ListUtils.getFirstElement(configProfileList);
		LOGGER.info("PrivacyQualityModel (PrivacyPollJob) - ConfigurationProfile: " + configurationActor);
		
		CompositeAttributeView compositeAttribute = getRootAttribute(configurationActor);
		
		Date lastTimestampDataInserted = trustworthinessService.getLastTimestampInsertedForMetrics(configurationActor.getPreferences());
		LOGGER.info("lastTimestampDataInserted: " + lastTimestampDataInserted);
		LOGGER.info("lastTimestampRead: " + lastTimestampRead);
		if (lastTimestampRead != null && lastTimestampDataInserted != null
				&& lastTimestampRead.equals(lastTimestampDataInserted)) {
			LOGGER.info(
					new Date() + " - No new data entered for privacy metrics in the Data table. Last timestamp read: " + lastTimestampRead);
			return;
		} else if (lastTimestampRead == null
				|| (lastTimestampRead != null && !lastTimestampRead.equals(lastTimestampDataInserted))) {
			lastTimestampRead = lastTimestampDataInserted;
			LOGGER.info("update lastTimestampRead: " + lastTimestampRead);
		}
		
		try {
			MetricData metricData = compositeAttribute.calculate(configurationActor, lastTimestampRead);
			LOGGER.info(new Date() + " - Calculated score for privacy: " + metricData.getValue());
			
			try {
				
				Integer resourceId = Integer.parseInt(PropertiesManager.getInstance().getProperty("resource.id"));
				
				Preference preference = trustworthinessService.findPreferenceById(compositeAttribute.getId());
				PrivacyScore privacyScore = new PrivacyScore(configurationActor.getConfigurationProfileID(),
						metricData.getMetricId().getMetricId(), metricData.getValue(), preference.getThreshold());
				privacyScore.setValueTime(System.currentTimeMillis() / 1000);
				privacyScore.setMetricId(metricData.getMetricId().getMetricId());
				privacyScore.setResourceId(resourceId);

				TrustworthinessScore trustworthinessScore = new TrustworthinessScore(privacyScore);
				
				// Add calculated score to kafka topic
				KafkaManager.getInstance().addItemKafka(trustworthinessScore);
				
			} catch (InterruptedException e) {
				LOGGER.error("InterruptedException when adding kafka item: ", e);
			} catch (ExecutionException e) {
				LOGGER.error("ExecutionException when adding kafka item: ", e);
			}
			
		} catch (UndefinedException e) {
			LOGGER.error("Property not defined in the quality model ", e);
		}

		LOGGER.info("PrivacyPollJob - end of execution..");
	}
	
	private CompositeAttributeView getRootAttribute(ConfigurationProfile configurationActor) {
		
		for (Preference preference : configurationActor.getPreferences()) {
			Integer metricId = preference.getId().getMetricId();
			
			TrustworthinessService trustworthinessService = SpringContextBridge.services().getTrustworthinessService();
			MetricAttributeView m = trustworthinessService.getMetricAttributeViewById(metricId);
			if ( m.getId() == m.getCompositeattribute().getId() ) {
				return (CompositeAttributeView) m;
			}
			
		}
		
		return null;
	}
	
	@Bean(name = "jobBean1")
	public JobDetailFactoryBean job() {
		return SchedulerConfig.createJobDetail(this.getClass());
	}

	@Bean(name = "jobBean1Trigger")
	public CronTriggerFactoryBean jobTrigger(@Qualifier("jobBean1") JobDetail jobDetail) {
		return SchedulerConfig.createCronTrigger(jobDetail, triggerJobTime);
	}

}
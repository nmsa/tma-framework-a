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

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttribute;
import eubr.atmosphere.tma.entity.qualitymodel.ConfigurationProfile;
import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubr.atmosphere.tma.entity.qualitymodel.Preference;
import eubr.atmosphere.tma.entity.qualitymodel.QualityModel;
import eubr.atmosphere.tma.exceptions.UndefinedException;
import eubr.atmosphere.tma.utils.ListUtils;
import eubrazil.atmosphere.config.quartz.SchedulerConfig;
import eubrazil.atmosphere.qualitymodel.SpringContextBridge;
import eubrazil.atmosphere.service.TrustworthinessService;

/**
 * Trustworthiness Poll Job
 * @author JorgeLuiz
 */
@Component
@DisallowConcurrentExecution
@PropertySource(ignoreResourceNotFound = true, value = "classpath:config.properties")
public class TrustworthinessPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	private static final Integer PRIVACY_CONFIGURATION_PROFILE_ID = 1;
	private static final Integer PRIVACY_QUALITY_MODEL_ID = 1;
	
	@Value("${trigger.job.time}")
	private String triggerJobTime;
	
	private static Date lastTimestampRead = null;

	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("TrustworthinessPollJob - execution..");

		TrustworthinessService trustworthinessService = SpringContextBridge.services().getTrustworthinessService();
		List<ConfigurationProfile> configProfileList = trustworthinessService.findConfigurationProfileInstance(PRIVACY_CONFIGURATION_PROFILE_ID);

		QualityModel qualityModel = trustworthinessService.getQualityModelById(PRIVACY_QUALITY_MODEL_ID);
		
		if (ListUtils.isEmpty(configProfileList)) {
			LOGGER.error("Quality Model for privacy not defined in the database.");
			return;
		}

		ConfigurationProfile configurationActor =  ListUtils.getFirstElement(configProfileList);
		LOGGER.info("TrustworthinessQualityModel (TrustworthinessPollJob) - ConfigurationProfile: " + configurationActor);
		
		Date lastTimestampDataInserted = trustworthinessService.getLastTimestampInsertedForMetrics(configurationActor.getMetrics());
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
		
		CompositeAttribute compositeAttribute = getRootAttribute(configurationActor);

		try {
			MetricData metricData = null;
			metricData = compositeAttribute.calculate(configurationActor, qualityModel, lastTimestampDataInserted);
			LOGGER.info(new Date() + " - Calculated score for trustworthiness: " + metricData.getValue());
			
			try {
				
//				Plan plan = trustworthinessService.getPlanIdByMetricAndConfigurationProfile(privacy.getAttributeId(),
//						configurationActor.getConfigurationprofileId());
				
//				PrivacyScore privacyScore = new PrivacyScore(configurationActor.getConfigurationprofileId(),
//						privacy.getAttributeId(), trustworthinessService.getInstanceValueById(),
//						metricData.getValue(), lastTimestampDataInserted);
//				
//				// Add calculated score to kafka topic
//				KafkaManager.getInstance().addItemKafka(privacyScore);
				
			} catch (InterruptedException e) {
				LOGGER.error("InterruptedException when adding kafka item: ", e);
			} catch (ExecutionException e) {
				LOGGER.error("ExecutionException when adding kafka item: ", e);
			}
			
		} catch (UndefinedException e) {
			LOGGER.error("Property not defined in the quality model ", e);
		}

		LOGGER.info("TrustworthinessPollJob - end of execution..");
	}
	
	private CompositeAttribute getRootAttribute(ConfigurationProfile configurationActor) {
		for (Preference preference : configurationActor.getPreferences()) {
			if ( preference.getAttributeType().isRoot() ) {
				return (CompositeAttribute) preference.getAttribute();
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
		return SchedulerConfig.createCronTrigger(jobDetail, triggerJobTime + " * * * * ?");
	}

}

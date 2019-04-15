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

import eubr.atmosphere.tma.utils.PrivacyScore;
import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.config.appconfig.PropertiesManager;
import eubrazil.atmosphere.config.quartz.SchedulerConfig;
import eubrazil.atmosphere.exceptions.UndefinedException;
import eubrazil.atmosphere.kafka.KafkaManager;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.qualitymodel.Preference;
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

	@Value("${trigger.job.time}")
	private String triggerJobTime;
	
	private static KafkaManager kafkaManager;

	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("TrustworthinessPollJob - execution..");

		TrustworthinessService privacyService = SpringContextBridge.services().getTrustworthinessService();
		List<ConfigurationProfile> configProfileList = privacyService.findPrivacyInstance();

		if (ListUtils.isEmpty(configProfileList)) {
			LOGGER.error("Quality Model for privacy not defined in the database.");
			return;
		}

		ConfigurationProfile configurationActor =  ListUtils.getFirstElement(configProfileList);
		LOGGER.info("TrustworthinessQualityModel (TrustworthinessPollJob) - ConfigurationProfile: " + configurationActor);

		Preference privacyPreference = configurationActor.getPreferences().iterator().next();
		CompositeAttribute privacy = (CompositeAttribute) privacyPreference.getAttribute();

		try {
			HistoricalData historicalData = privacy.calculate(configurationActor);
			LOGGER.info(new Date() + " - Calculated score for trustworthiness: " + historicalData.getValue());
			
			// Send calculated score to kafka topic
			kafkaManager = new KafkaManager();
			try {
				
				Integer probeId = Integer.parseInt(PropertiesManager.getInstance().getProperty("probe.id"));
				Integer descriptionId = Integer.parseInt(PropertiesManager.getInstance().getProperty("description.id"));
				Integer resourceId = Integer.parseInt(PropertiesManager.getInstance().getProperty("resource.id"));
				
				PrivacyScore privacyScore = new PrivacyScore(historicalData.getValue(), configurationActor.getConfigurationprofileId(), probeId, descriptionId, resourceId);
				kafkaManager.addItemKafka(privacyScore);
				
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

	@Bean(name = "jobBean1")
	public JobDetailFactoryBean job() {
		return SchedulerConfig.createJobDetail(this.getClass());
	}

	@Bean(name = "jobBean1Trigger")
	public CronTriggerFactoryBean jobTrigger(@Qualifier("jobBean1") JobDetail jobDetail) {
		return SchedulerConfig.createCronTrigger(jobDetail, triggerJobTime + " * * * * ?");
	}

}

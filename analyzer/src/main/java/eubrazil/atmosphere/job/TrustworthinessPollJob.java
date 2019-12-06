package eubrazil.atmosphere.job;

import java.util.Date;
import java.util.List;

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
	
	@Value("${trustworthiness.configuration.profile.id}")
	private Integer trustworthinessConfigurationProfileID;
	
	@Value("${trustworthiness.quality.model.id}")
	private Integer trustworthinessQualityModelID;
	
	@Value("${trustworthiness.trigger.job.time}")
	private String triggerJobTime;
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("TrustworthinessPollJob - execution..");

		TrustworthinessService trustworthinessService = SpringContextBridge.services().getTrustworthinessService();
		
		List<ConfigurationProfile> configProfileList = trustworthinessService.findConfigurationProfileInstance(trustworthinessConfigurationProfileID);
		if (ListUtils.isEmpty(configProfileList)) {
			LOGGER.error("Configuration Profile for trustworthiness not defined in the Knowledge base.");
			return;
		}

		ConfigurationProfile configurationActor =  ListUtils.getFirstElement(configProfileList);
		LOGGER.info("TrustworthinessQualityModel (TrustworthinessPollJob) - ConfigurationProfile: " + configurationActor);
		
		CompositeAttributeView compositeAttribute = getRootAttribute(configurationActor);
		
		try {
			MetricData metricData = compositeAttribute.calculate(configurationActor, null);
			LOGGER.info(new Date() + " - Calculated score for trustworthiness: " + metricData.getValue());
		} catch (UndefinedException e) {
			LOGGER.error("Property not defined in the quality model ", e);
		}

		LOGGER.info("TrustworthinessPollJob - end of execution..");
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
	
	@Bean(name = "jobBean2")
	public JobDetailFactoryBean job() {
		return SchedulerConfig.createJobDetail(this.getClass());
	}

	@Bean(name = "jobBean2Trigger")
	public CronTriggerFactoryBean jobTrigger(@Qualifier("jobBean2") JobDetail jobDetail) {
		return SchedulerConfig.createCronTrigger(jobDetail, triggerJobTime);
	}

}
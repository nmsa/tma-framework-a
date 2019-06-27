package eubrazil.atmosphere.job;

import java.util.List;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.config.quartz.SchedulerConfig;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.SpringContextBridge;
import eubrazil.atmosphere.service.TrustworthinessService;

/**
 * VirtualizationPollJob - If we need to create another job to run at a different frequency
 * @author JorgeLuiz
 */
@Component
@DisallowConcurrentExecution
public class VirtualizationPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	private static final Integer VIRTUALIZATION_CONFIGURATION_PROFILE_ID = 3;
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("VirtualizationPollJob - execution..");
		
		TrustworthinessService trustworthinessService = SpringContextBridge.services().getTrustworthinessService();
		List<ConfigurationProfile> configProfileList = trustworthinessService
				.findConfigurationProfileInstance(VIRTUALIZATION_CONFIGURATION_PROFILE_ID);

		if (ListUtils.isEmpty(configProfileList)) {
			LOGGER.error("Quality Model for virtualization not defined in the database.");
			return;
		}
		
		ConfigurationProfile configurationActor =  ListUtils.getFirstElement(configProfileList);
		LOGGER.info("VirtualizationQualityModel (VirtualizationPollJob) - ConfigurationProfile: " + configurationActor);
		
		LOGGER.info("VirtualizationPollJob - end of execution..");
	}

	@Bean(name = "jobBean2")
	public JobDetailFactoryBean job() {
	    return SchedulerConfig.createJobDetail(this.getClass());
	}

	@Bean(name = "jobBean2Trigger")
	public CronTriggerFactoryBean jobTrigger(@Qualifier("jobBean2")JobDetail jobDetail) {
	    return SchedulerConfig.createCronTrigger(jobDetail, "0/20 * * * * ?");
	}

}

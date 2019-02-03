package eubrazil.atmosphere.job;

import java.util.Date;

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

import eubrazil.atmosphere.config.quartz.SchedulerConfig;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.Preference;
import eubrazil.atmosphere.qualitymodel.initialize.TrustworthinessQualityModel;

@Component
@DisallowConcurrentExecution
public class TrustworthinessPollJob implements Job {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("TrustworthinessPollJob - execution..");

		ConfigurationProfile configurationActor = TrustworthinessQualityModel.getPrivacyInstance().getConfigurationActor();
		LOGGER.info("TrustworthinessPollJob - ConfigurationProfile: " + configurationActor);

		Preference privacyPreference = configurationActor.getPreferences().iterator().next();
		CompositeAttribute privacy = (CompositeAttribute) privacyPreference.getAttribute();

		LOGGER.info(new Date() + " - Calculated score for trustworthiness: " + privacy.calculate(configurationActor));

		LOGGER.info("TrustworthinessPollJob - end of execution..");
	}

	@Bean(name = "jobBean1")
	public JobDetailFactoryBean job() {
		return SchedulerConfig.createJobDetail(this.getClass());
	}

	@Bean(name = "jobBean1Trigger")
	public CronTriggerFactoryBean jobTrigger(@Qualifier("jobBean1") JobDetail jobDetail) {
		return SchedulerConfig.createCronTrigger(jobDetail, "0/5 * * * * ?");
	}

}

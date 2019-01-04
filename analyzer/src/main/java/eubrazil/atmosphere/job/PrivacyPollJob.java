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

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.config.SchedulerConfig;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.Preference;
import eubrazil.atmosphere.qualitymodel.initialize.PrivacyQualityModel;

@Component
@DisallowConcurrentExecution
public class PrivacyPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		System.out.println("PrivacyPollJob execution..");

		ConfigurationProfile configurationActor = PrivacyQualityModel.getPrivacyInstance().getConfigurationActor();
		System.out.println(configurationActor);
		
		Preference privacyPreference = ListUtils.getFirstElement(configurationActor.getPreferences());
		CompositeAttribute privacy = (CompositeAttribute) privacyPreference.getAttribute();
		
		System.out.println(new Date() + " - Calculated score for privacy: " + privacy.calculate(configurationActor));
		
		System.out.println("PrivacyPollJob end execution..");
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

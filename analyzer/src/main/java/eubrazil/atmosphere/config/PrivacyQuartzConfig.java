package eubrazil.atmosphere.config;

import javax.annotation.PostConstruct;

import org.quartz.SimpleTrigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

import eubrazil.atmosphere.job.PrivacyPollJob;

@Configuration
public class PrivacyQuartzConfig extends AbstractQuartzConfig {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());

	@PostConstruct
	public void init() {
		LOGGER.info("QuartzConfig initialized.");
		this.analyzerPollJob = new PrivacyPollJob();
	}
	
	@Bean
    public SimpleTriggerFactoryBean procesoMQTrigger() {
        SimpleTriggerFactoryBean trigger = new SimpleTriggerFactoryBean();
        trigger.setJobDetail(procesoMQJob().getObject());

        LOGGER.info("Configuring trigger to fire every {} seconds", this.analyzerPollJob.getFrequencyInSec());

        trigger.setRepeatInterval(this.analyzerPollJob.getFrequencyInSec() * 1000);
        trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
        trigger.setName("Privacy_Qrtz_Trigger");
        return trigger;
    }
	
	@Bean
	public JobDetailFactoryBean procesoMQJob() {
		JobDetailFactoryBean jobDetailFactory = new JobDetailFactoryBean();
		jobDetailFactory.setJobClass(PrivacyPollJob.class);
		jobDetailFactory.setGroup("privacy_analyzer-quartz");
		return jobDetailFactory;
	}

	@Override
	public String getSchedulerName() {
		return "privacy-quartz-scheduler";
	}
	
}

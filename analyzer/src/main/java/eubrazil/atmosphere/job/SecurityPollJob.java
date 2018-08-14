package eubrazil.atmosphere.job;

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

import eubrazil.atmosphere.config.SchedulerConfig;

@Component
@DisallowConcurrentExecution
public class SecurityPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		LOGGER.info("SecurityPollJob executando..");
		
		LOGGER.info("...");
		
		LOGGER.info("SecurityPollJob fim execução..");
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

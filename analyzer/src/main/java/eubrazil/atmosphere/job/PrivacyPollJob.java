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
import eubrazil.atmosphere.qualitymodel.initialize.PrivacyQualityModel;

@Component
@DisallowConcurrentExecution
public class PrivacyPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	private PrivacyService privacyService;

	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
//		System.out.println("PrivacyPollJob executing..");
//		try {
//			Privacy privacy = this.privacyService.getLastMeasure();
//			if (privacy != null) {
//		        System.out.println(privacy.toString());
//			} else {
//				LOGGER.info("Measure not found..");
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("PrivacyPollJob end execution..");

		PrivacyQualityModel.getInstance().getPrivacyInstance();

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

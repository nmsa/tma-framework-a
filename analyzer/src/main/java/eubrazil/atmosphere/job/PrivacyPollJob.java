package eubrazil.atmosphere.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.config.SchedulerConfig;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.initialize.PrivacyQualityModel;
import eubrazil.atmosphere.service.MetricService;

@Component
@DisallowConcurrentExecution
public class PrivacyPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MetricService metricService;
	
	@Override
	public void execute(JobExecutionContext jobExecutionContext) {
		System.out.println("PrivacyPollJob execution..");

		ConfigurationProfile configurationProfile = PrivacyQualityModel.getPrivacyInstance().getConfigurationProfile();
		System.out.println(configurationProfile);
//		Iterator<Metric> it = configurationProfile.getMetrics().iterator();
//		while (it.hasNext()) {
//			Metric metric = it.next();
//			Leafattribute leaf = metric.getAttribute();
//			System.out.println(leaf);
//			try {
//				System.out.println("updating data list");
//				System.out.println("Resource name: " + metric.getResourceName());
//				List<Data> dataList = metricService.getLimitedDataListByName(metric.getResourceName(),
//						metric.getProbeName(), metric.getDescriptionName(), new PageRequest(0, leaf.getNumSamples()));
//				System.out.println("Data list: " + dataList.toString());
//				System.out.println(leaf.calculate(configurationProfile, dataList));
//			} catch (UndefinedMetricException e) {
//				System.out.println("Error invoking method calculate: " + e);
//			}
//		}
		
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

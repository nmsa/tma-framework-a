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
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.qualitymodel.Leafattribute;
import eubrazil.atmosphere.qualitymodel.Metric;
import eubrazil.atmosphere.qualitymodel.MetricAggregationOperator;
import eubrazil.atmosphere.qualitymodel.MetricNormalizationKind;
import eubrazil.atmosphere.qualitymodel.Preference;
import eubrazil.atmosphere.service.PrivacyService;

@Component
@DisallowConcurrentExecution
public class PrivacyPollJob implements Job {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PrivacyService privacyService;

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
		
		// Creating quality model instancy for privacy
		ConfigurationProfile configurationActor = new ConfigurationProfile();
		Preference privacyPreference = new Preference(0.2, 0.05);
		Preference informationLossPreference = new Preference(0.1, 0.7);
		Leafattribute informationLoss = new Leafattribute(MetricNormalizationKind.BENEFIT, 0.0, 1.0, 1,
				MetricAggregationOperator.AVERAGE);
		Preference reIdentificationRiskPreference = new Preference(0.9, 0.05);
		Leafattribute reIdentificationRisk = new Leafattribute(MetricNormalizationKind.COST, 0.0, 1.0, 1,
				MetricAggregationOperator.AVERAGE);
		
		Metric informationLossMetric = new Metric();
		Metric reIdentificationRiskMetric = new Metric();
		
		HistoricalData privacyHistoricalData = new HistoricalData();
		
		
		
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

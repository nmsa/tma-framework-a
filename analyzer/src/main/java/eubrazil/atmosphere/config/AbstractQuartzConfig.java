package eubrazil.atmosphere.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.quartz.Trigger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import eubrazil.atmosphere.config.quartz.AutowiringSpringBeanJobFactory;
import eubrazil.atmosphere.job.AnalyzerPollJob;

public abstract class AbstractQuartzConfig {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
	@Autowired
	protected DataSource dataSource;

	@Autowired
	protected PlatformTransactionManager transactionManager;

	@Autowired
	protected ApplicationContext applicationContext;
	
	protected AnalyzerPollJob analyzerPollJob;
	
	@Bean
	public SchedulerFactoryBean quartzScheduler() {
		SchedulerFactoryBean quartzScheduler = new SchedulerFactoryBean();

		quartzScheduler.setDataSource(dataSource);
		quartzScheduler.setTransactionManager(transactionManager);
		quartzScheduler.setOverwriteExistingJobs(true);
		quartzScheduler.setSchedulerName(getSchedulerName());

		// custom job factory of spring with DI support for @Autowired!
		AutowiringSpringBeanJobFactory jobFactory = new AutowiringSpringBeanJobFactory();
		jobFactory.setApplicationContext(applicationContext);
		quartzScheduler.setJobFactory(jobFactory);

		quartzScheduler.setQuartzProperties(quartzProperties());

		Trigger[] triggers = { procesoMQTrigger().getObject() };
		quartzScheduler.setTriggers(triggers);

		return quartzScheduler;
	}
	
	public abstract SimpleTriggerFactoryBean procesoMQTrigger();
	
	public abstract String getSchedulerName();
	
	@Bean
	public Properties quartzProperties() {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		propertiesFactoryBean.setLocation(new ClassPathResource("/quartz.properties"));
		Properties properties = null;
		try {
			propertiesFactoryBean.afterPropertiesSet();
			properties = propertiesFactoryBean.getObject();

		} catch (IOException e) {
			LOGGER.warn("Cannot load quartz.properties.");
		}

		return properties;
	}
	
}

package eubrazil.atmosphere.job;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.service.PrivacyService;

@Service
@Transactional
public class PrivacyPollJob implements Job {

	public static final Logger LOGGER = LoggerFactory.getLogger(PrivacyPollJob.class);
	
	@Autowired
	private PrivacyService privacyService;
	
	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
	
		System.out.println("AnalyserPullJob executando..");
		try {
			Privacy privacy = this.privacyService.getLastMeasure();
			if (privacy != null) {
		        System.out.println(privacy.toString());
			} else {
				LOGGER.info("Measure not found..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AnalyserPullJob fim execução..");
		
	}

}

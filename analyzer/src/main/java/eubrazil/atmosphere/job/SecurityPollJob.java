package eubrazil.atmosphere.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SecurityPollJob extends AnalyzerPollJob {

	public static final Logger LOGGER = LoggerFactory.getLogger(SecurityPollJob.class);
	
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("SecurityPollJob executando..");
		// ...
		System.out.println("SecurityPollJob fim execução..");
	}

	@Override
	public int getFrequencyInSec() {
		return 2;
	}

}

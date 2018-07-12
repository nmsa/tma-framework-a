package eubrazil.atmosphere.job;

import org.quartz.Job;

public abstract class AnalyzerPollJob implements Job {

	public abstract int getFrequencyInSec();
	
}

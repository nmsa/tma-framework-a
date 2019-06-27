package eubrazil.atmosphere.service;


import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Pageable;

import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.qualitymodel.Metric;

/**
 * Trustworthiness services
 * @author JorgeLuiz
 */
public interface TrustworthinessService {

	public List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId,
			Pageable numSamples);
	
	public List<Data> getLimitedDataListByIdAndTimestamp(Integer probeId, Integer descriptionId, Integer resourceId, Date timestamp);

	public void save(HistoricalData historicalData);

	public List<ConfigurationProfile> findConfigurationProfileInstance(Integer configurationProfileID);

	public Date getLastTimestampInsertedForMetrics(Set<Metric> metrics);
	
	public Double getInstanceValueById();
	
}

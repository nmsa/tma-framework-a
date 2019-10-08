package eubrazil.atmosphere.service;


import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Pageable;

import eubr.atmosphere.tma.entity.qualitymodel.ConfigurationProfile;
import eubr.atmosphere.tma.entity.qualitymodel.Data;
import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;
import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubr.atmosphere.tma.entity.qualitymodel.Preference;
import eubr.atmosphere.tma.entity.qualitymodel.QualityModel;

/**
 * Trustworthiness services
 * @author JorgeLuiz
 */
public interface TrustworthinessService {

	public List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId,
			Pageable numSamples);
	
	public List<Data> getLimitedDataListByIdAndTimestamp(Integer probeId, Integer descriptionId, Integer resourceId, Date timestamp);

	public void save(MetricData metricData);

	public List<ConfigurationProfile> findConfigurationProfileInstance(Integer configurationProfileID);

	public Date getLastTimestampInsertedForMetrics(Set<MetricAttributeView> metrics);
	
	public Double getInstanceValueById();

	public QualityModel getQualityModelById(Integer qualityModelId);

	MetricAttributeView getMetricAttributeViewById(Integer id);

	Preference findPreferenceById(int id);
	
}

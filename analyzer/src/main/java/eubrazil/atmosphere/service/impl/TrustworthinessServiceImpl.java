package eubrazil.atmosphere.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import eubr.atmosphere.tma.entity.qualitymodel.ConfigurationProfile;
import eubr.atmosphere.tma.entity.qualitymodel.Data;
import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;
import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubr.atmosphere.tma.entity.qualitymodel.Preference;
import eubr.atmosphere.tma.entity.qualitymodel.QualityModel;
import eubr.atmosphere.tma.utils.ListUtils;
import eubrazil.atmosphere.config.appconfig.PropertiesManager;
import eubrazil.atmosphere.repository.ConfigurationProfileRepository;
import eubrazil.atmosphere.repository.DataRepository;
import eubrazil.atmosphere.repository.MetricAttributeViewRepository;
import eubrazil.atmosphere.repository.MetricDataRepository;
import eubrazil.atmosphere.repository.PreferenceRepository;
import eubrazil.atmosphere.repository.QualityModelRepository;
import eubrazil.atmosphere.service.TrustworthinessService;

/**
 * Implementation of trustworthiness services
 * @author JorgeLuiz
 */
@Service
public class TrustworthinessServiceImpl implements TrustworthinessService {

	@Autowired
	private DataRepository dataRepository;
	
	@Autowired
	private MetricDataRepository historicalDataRepository;
	
	@Autowired
	private ConfigurationProfileRepository configurationProfileRepository;

	@Autowired
	private QualityModelRepository qualityModelRepository;
	
	@Autowired
	private MetricAttributeViewRepository metricAttributeViewRepository;
	
	@Autowired
	private PreferenceRepository preferenceRepository;
	
	@Override
	public List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId,
			Pageable numSamples) {
		return dataRepository.getLimitedDataListById(probeId, descriptionId, resourceId, numSamples);
	}
	
	@Override
	public List<Data> getLimitedDataListByIdAndTimestamp(Integer probeId, Integer descriptionId, Integer resourceId, Date timestamp) {
		return dataRepository.getLimitedDataListByIdAndTimestamp(probeId, descriptionId, resourceId, timestamp);
	}
	
	@Override
	public void save(MetricData metricData) {
		historicalDataRepository.save(metricData);
	}
	
	@Override
	public List<ConfigurationProfile> findConfigurationProfileInstance(Integer configurationProfileID) {
		return configurationProfileRepository.findConfigurationProfileInstance(configurationProfileID);
	}
	
	@Override
	public Double getInstanceValueById() {
		
		Double instanceValue = null;
		
		Integer probeId = Integer.parseInt(PropertiesManager.getInstance().getProperty("probe.id"));
		Integer resourceId = Integer.parseInt(PropertiesManager.getInstance().getProperty("resource.id"));
		Integer descriptionId = Integer.parseInt(PropertiesManager.getInstance().getProperty("id"));
		
		List<Double> instanceValues = dataRepository.getInstanceValueById(probeId, descriptionId, resourceId);
		if ( ListUtils.isNotEmpty(instanceValues) ) {
			instanceValue = ListUtils.getFirstElement(instanceValues);
		}
		
		return instanceValue;
	}
	
	@Override
	public QualityModel getQualityModelById(Integer qualityModelId) {
		return qualityModelRepository.getQualityModelById(qualityModelId);
	}

	@Override
	public MetricAttributeView getMetricAttributeViewById(Integer id) {
		return metricAttributeViewRepository.getMetricAttributeViewById(id);
	}
	
	@Override
	public Preference findPreferenceById(int id) {
		return preferenceRepository.findPreferenceById(id);
	}
	
}

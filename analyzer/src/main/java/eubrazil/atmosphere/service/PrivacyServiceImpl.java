package eubrazil.atmosphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.repository.ConfigurationProfileRepository;
import eubrazil.atmosphere.repository.DataRepository;
import eubrazil.atmosphere.repository.HistoricalDataRepository;
import eubrazil.atmosphere.repository.PrivacyRepository;
import eubrazil.atmosphere.service.spec.PrivacyService;

@Service
public class PrivacyServiceImpl implements PrivacyService {

	@Autowired
	private PrivacyRepository privacyRepository;

	@Autowired
	private DataRepository dataRepository;
	
	@Autowired
	private HistoricalDataRepository historicalDataRepository;
	
	@Autowired
	private ConfigurationProfileRepository configurationProfileRepository;
	
	@Override
	public List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId,
			Pageable numSamples) {
		System.out.println("probeId: " + probeId);
		System.out.println("descriptionId: " + descriptionId);
		System.out.println("resourceId: " + resourceId);
		System.out.println("numSamples: " + numSamples);
		return dataRepository.getLimitedDataListById(probeId, descriptionId, resourceId, numSamples);
	}
	
	@Override
	public Privacy getLastMeasure() {
		List<Privacy> privacyList = this.privacyRepository.getLastMeasure();
		if (ListUtils.isNotEmpty(privacyList)) {
			return ListUtils.getFirstElement(privacyList);
		}
		return null;
	}
	
	@Override
	public void save(HistoricalData historicalData) {
		historicalDataRepository.save(historicalData);
	}
	
	@Override
	public List<ConfigurationProfile> findPrinvacyInstance() {
		return configurationProfileRepository.findPrinvacyInstance();
	}
	
	public HistoricalData getLastHitoricalDataByChild() {
		return new HistoricalData(); // TODO - Implementar busca na base
	}

}

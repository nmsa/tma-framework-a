package eubrazil.atmosphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.qualitymodel.HistoricalData;
import eubrazil.atmosphere.repository.DataRepository;
import eubrazil.atmosphere.repository.PrivacyRepository;

@Service
public class PrivacyService {

	@Autowired
	private PrivacyRepository privacyRepository;

	@Autowired
	private DataRepository dataRepository;

	public Privacy getLastMeasure() {
		List<Privacy> privacyList = this.privacyRepository.getLastMeasure();
		if (ListUtils.isNotEmpty(privacyList)) {
			return ListUtils.getFirstElement(privacyList);
		}
		return null;
	}

	public List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName,
			Pageable numSamples) {
		System.out.println("resourceName: " + resourceName);
		System.out.println("probeName: " + probeName);
		System.out.println("descriptionName: " + descriptionName);
		System.out.println("numSamples: " + numSamples);
		return this.dataRepository.getLimitedDataListByName(resourceName, probeName, descriptionName, numSamples);
	}
	
	public HistoricalData getLastHitoricalDataByChild() {
		return new HistoricalData(); // TODO - Implementar busca na base
	}

}

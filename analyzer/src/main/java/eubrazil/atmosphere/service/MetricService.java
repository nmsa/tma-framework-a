package eubrazil.atmosphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.repository.MetricRepository;

@Service
public class MetricService {

	@Autowired
	private MetricRepository metricRepository;

	public List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName,
			Pageable numSamples) {
		System.out.println("resourceName: " + resourceName);
		System.out.println("probeName: " + probeName);
		System.out.println("descriptionName: " + descriptionName);
		System.out.println("numSamples: " + numSamples);
		return metricRepository.getLimitedDataListByName(resourceName, probeName, descriptionName, numSamples);
	}

}

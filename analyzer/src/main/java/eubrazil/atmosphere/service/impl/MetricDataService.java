package eubrazil.atmosphere.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubr.atmosphere.tma.entity.qualitymodel.MetricData;
import eubrazil.atmosphere.repository.MetricDataRepository;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Service
public class MetricDataService {

	@Autowired
	private MetricDataRepository repository;
	
	public void save(MetricData m) {
		repository.save(m);
	}
	
	public MetricData getLastMetricDataById(int pK){
		return repository.findlLastMetricDataById(pK);
	}
	
	public List<MetricData> getAllMetricData(){
		List<MetricData> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}
}
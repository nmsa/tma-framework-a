package eubrazil.atmosphere.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;
import eubrazil.atmosphere.repository.MetricRepository;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Service
public class MetricService {

	@Autowired
	private MetricRepository repository;
	
	public void save(MetricAttributeView a) {
		repository.save(a);
	}
	
	public List<MetricAttributeView> getAllMetrics(){
		List<MetricAttributeView> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}
}

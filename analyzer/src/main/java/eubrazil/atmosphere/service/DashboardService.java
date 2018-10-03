package eubrazil.atmosphere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.entity.Properties;
import eubrazil.atmosphere.repository.DashboardRepository;

@Service
public class DashboardService {

	@Autowired
	private DashboardRepository repository;
	
	public void save(Properties prop) {
		repository.save(prop);
	}
	
}

package eubrazil.atmosphere.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.entity.Properties;
import eubrazil.atmosphere.repository.DashboardRepository;

@Service
public class DashboardService {

	@Autowired
	private DashboardRepository repository;
	
	public void save(String vtest1, String vtest2) {
		Properties prop = new Properties();
		prop.setVtest1(vtest1);
		prop.setVtest2(vtest2);
		repository.save(prop);
	}
	
}

package eubrazil.atmosphere.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubr.atmosphere.tma.entity.qualitymodel.Preference;
import eubrazil.atmosphere.repository.PreferenceRepository;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Service
public class PreferenceService {

	@Autowired
	private PreferenceRepository repository;
	
	public void save(Preference p) {
		repository.save(p);
	}
	
	public Preference getPreferenceById(int pK){
		return repository.findPreferenceById(pK);
	}
	
	public List<Preference> getAllPreferences(){
		List<Preference> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}
}

package eubrazil.atmosphere.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.qualitymodel.Attribute;
import eubrazil.atmosphere.repository.AttributeRepository;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Service
public class AttributeService {

	@Autowired
	private AttributeRepository repository;
	
	public void save(Attribute a) {
		repository.save(a);
	}
	
	public List<Attribute> getAllAttributes(){
		List<Attribute> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}
}

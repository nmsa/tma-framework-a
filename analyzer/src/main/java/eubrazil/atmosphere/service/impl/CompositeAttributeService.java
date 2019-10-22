package eubrazil.atmosphere.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.repository.CompositeAttributeRepository;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Service
public class CompositeAttributeService {

	@Autowired
	private CompositeAttributeRepository repository;
	
	public void save(CompositeAttribute c) {
		repository.save(c);
	}
	
	public List<CompositeAttribute> getAllCompositeAttributes(){
		List<CompositeAttribute> list = new ArrayList<>();
		repository.findAll().forEach(e -> list.add(e));
		return list;
	}

	public List<CompositeAttribute> getAllRootCompositeAttributes(){
		List<CompositeAttribute> list = new ArrayList<>();
		repository.findAllRoots().forEach(e -> list.add(e));
		return list;
	}

	public List<CompositeAttribute> getAllChildrenCompositeAttributes(int id){
		List<CompositeAttribute> list = new ArrayList<>();
		repository.findAllChildrenByParent(id).forEach(e -> list.add(e));
		return list;
	}
}

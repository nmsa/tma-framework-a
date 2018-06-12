package eubrazil.atmosphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.repository.PrivacyRepository;

@Service
public class PrivacyService {

	@Autowired
	private PrivacyRepository repository;
	
	public Privacy getLastMeasure() {
		List<Privacy> privacyList = this.repository.getLastMeasure();
		if (ListUtils.isNotEmpty(privacyList)) {
			return ListUtils.getFirstElement(privacyList);
		}
		return null;
	}
	
}

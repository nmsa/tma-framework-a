package eubrazil.atmosphere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.repository.ConfigurationProfileRepository;

@Service
public class ConfigurationProfileService {

	@Autowired
	private ConfigurationProfileRepository repository;
	
	public ConfigurationProfile getPrivacyInstance() {
		List<ConfigurationProfile> configProfileList = this.repository.findAll();
		if (ListUtils.isNotEmpty(configProfileList)) {
			return ListUtils.getFirstElement(configProfileList);
		}
		return null;
	}
	
}

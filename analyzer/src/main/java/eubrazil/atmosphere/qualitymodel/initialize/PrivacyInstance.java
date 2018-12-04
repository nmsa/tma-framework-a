package eubrazil.atmosphere.qualitymodel.initialize;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.service.ConfigurationProfileService;

@Component
public class PrivacyInstance {

	@Autowired
	private Environment environment;

	@Autowired
	private ConfigurationProfileService configProfileService;
	
	@PostConstruct
	public void init() {
		System.out.println("Init method called...");
		System.out.println(Arrays.asList(environment.getDefaultProfiles()));
		
		ConfigurationProfile configurationProfile = configProfileService.getPrivacyInstance();
		
		System.out.println("Id configuration profile: " + configurationProfile.getConfigurationprofileId());
		
	}
}

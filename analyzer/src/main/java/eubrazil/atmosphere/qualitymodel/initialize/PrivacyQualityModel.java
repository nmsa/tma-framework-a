package eubrazil.atmosphere.qualitymodel.initialize;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.service.ConfigurationProfileService;

@Component
public class PrivacyQualityModel {

	private static final PrivacyQualityModel INSTANCE = new PrivacyQualityModel();

	@Autowired
	private ConfigurationProfileService configProfileService;

	private ConfigurationProfile configurationProfile = null;

	public static PrivacyQualityModel getInstance() {
		return INSTANCE;
	}

	private PrivacyQualityModel() {
	}

	@PostConstruct
	public void init() {
		System.out.println("Initializing privacy instance...");

		configurationProfile = configProfileService.getPrivacyInstance();
		System.out.println(configurationProfile);

		System.out.println("Privacy instance initialized...");
	}

	public ConfigurationProfile getPrivacyInstance() {
		return configurationProfile;
	}

}

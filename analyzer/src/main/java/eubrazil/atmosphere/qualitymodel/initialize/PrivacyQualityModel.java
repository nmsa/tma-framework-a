package eubrazil.atmosphere.qualitymodel.initialize;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.service.ConfigurationProfileService;

@Component
public class PrivacyQualityModel {

	private static PrivacyQualityModel instance = new PrivacyQualityModel();
	
	@Autowired
	private ConfigurationProfileService configProfileService;

	private ConfigurationProfile configurationProfile = null;
	
	private PrivacyQualityModel() {
	}

	@PostConstruct
	public void init() {
		System.out.println("-------------------------------------------------------");
		System.out.println("------------Initializing privacy instance--------------");
		System.out.println("-------------------------------------------------------");

		this.configurationProfile = configProfileService.getPrivacyInstance();
		System.out.println(this.configurationProfile);
		instance.setConfigurationProfile(configurationProfile);

		System.out.println("-------------------------------------------------------");
		System.out.println("------------Privacy instance initialized------------");
		System.out.println("-------------------------------------------------------");
	}

	public static PrivacyQualityModel getPrivacyInstance() {
		return instance;
	}
	
	public ConfigurationProfile getConfigurationProfile() {
		return configurationProfile;
	}

	public void setConfigurationProfile(ConfigurationProfile configurationProfile) {
		this.configurationProfile = configurationProfile;
	}

}

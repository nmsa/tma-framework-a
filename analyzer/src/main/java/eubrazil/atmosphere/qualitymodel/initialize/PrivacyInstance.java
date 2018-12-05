package eubrazil.atmosphere.qualitymodel.initialize;

import java.util.Arrays;
import java.util.Iterator;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.Metric;
import eubrazil.atmosphere.qualitymodel.Preference;
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
		
		System.out.println("Metrics size: " + configurationProfile.getMetrics().size());
		
		System.out.println("LeafAttributes: ");
		Iterator<Metric> it = configurationProfile.getMetrics().iterator();
		while(it.hasNext()) {
			Metric m = it.next();
			System.out.println("LeafAttribute Name: " + m.getAttribute().getName());
		}
		
		System.out.println("Preference size: " + configurationProfile.getPreferences().size());
		
		System.out.println("Preferences: ");
		Iterator<Preference> it2 = configurationProfile.getPreferences().iterator();
		while(it2.hasNext()) {
			Preference p = it2.next();
			System.out.println("Preference Name: " + p.getAttribute().getName());
		}
		
	}
}

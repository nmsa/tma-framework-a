package eubrazil.atmosphere.qualitymodel.initialize;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.commons.utils.ListUtils;
import eubrazil.atmosphere.qualitymodel.CompositeAttribute;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.Leafattribute;
import eubrazil.atmosphere.qualitymodel.Metric;
import eubrazil.atmosphere.qualitymodel.Preference;
import eubrazil.atmosphere.service.TrustworthinessService;

@Component
public class TrustworthinessQualityModel {

	private static TrustworthinessQualityModel instance = new TrustworthinessQualityModel();

	private ConfigurationProfile configurationActor = null;
	
	@Autowired
	private TrustworthinessService trustworthinessService;
	
	private TrustworthinessQualityModel() {
	}

	@PostConstruct
	public void init() {
		System.out.println("-------------------------------------------------------");
		System.out.println("---------Initializing trustworthiness instance---------");
		System.out.println("-------------------------------------------------------");
		
		//TODO Load Config profile active = true;
		
		List<ConfigurationProfile> configProfileList = trustworthinessService.findPrinvacyInstance();
		
		ConfigurationProfile configurationActorBD = null;
		if (ListUtils.isNotEmpty(configProfileList)) {
			configurationActorBD =  ListUtils.getFirstElement(configProfileList);
			System.out.println("configurationActorBD: " + configurationActorBD);
		}
		
		this.configurationActor = new ConfigurationProfile();
		
		CompositeAttribute privacy = new CompositeAttribute();
		for (Preference pref : configurationActorBD.getPreferences()) {
			Preference newPreference = new Preference(pref.getAttribute().getAttributeId(), pref.getThreshold(),
					pref.getWeight());
			
			if (pref.getAttribute() instanceof CompositeAttribute) {
				privacy.setAttributeId(pref.getAttribute().getAttributeId());
				newPreference.setAttribute(privacy);
			} else {
				Leafattribute leaf = (Leafattribute) pref.getAttribute();
				Leafattribute leafAttribute = new Leafattribute(leaf.getAttributeId(), leaf.getNormalizationKind(),
						leaf.getNormalizationMax(), leaf.getNormalizationMin(), leaf.getNumSamples(),
						leaf.getOperator());
				if (!privacy.getChildren().contains(leafAttribute)) {
					privacy.addAttribute(leafAttribute);
				}
				newPreference.setAttribute(leafAttribute);
			}
			if (!this.configurationActor.getPreferences().contains(newPreference)) {
				this.configurationActor.addPreference(newPreference);
			}
		}
		
		for (Metric m : configurationActorBD.getMetrics()) {
			Metric newMetric = new Metric();
			newMetric.setDescriptionName(m.getDescriptionName());
			newMetric.setProbeName(m.getProbeName());
			newMetric.setResourceName(m.getResourceName());
			
			for (Preference pref : this.configurationActor.getPreferences()) {
				if (pref.getAttribute() instanceof Leafattribute) {
					if (m.getAttributeId() == pref.getAttribute().getAttributeId()) {
						newMetric.setAttribute((Leafattribute) pref.getAttribute());
					}
				}
			}
			this.configurationActor.addMetric(newMetric);
		}
		
		instance.setConfigurationActor(configurationActor);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("---------Trustworthiness instance inicialized----------");
		System.out.println("-------------------------------------------------------");
	}

	public static TrustworthinessQualityModel getPrivacyInstance() {
		return instance;
	}

	public ConfigurationProfile getConfigurationActor() {
		return configurationActor;
	}

	public void setConfigurationActor(ConfigurationProfile configurationActor) {
		this.configurationActor = configurationActor;
	}

}

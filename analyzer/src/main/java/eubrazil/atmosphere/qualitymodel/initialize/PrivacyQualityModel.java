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
import eubrazil.atmosphere.service.spec.PrivacyService;

@Component
public class PrivacyQualityModel {

	private static PrivacyQualityModel instance = new PrivacyQualityModel();

	private ConfigurationProfile configurationActor = null;
	
	@Autowired
	private PrivacyService privacyService;
	
	private PrivacyQualityModel() {
	}

	@PostConstruct
	public void init() {
		System.out.println("-------------------------------------------------------");
		System.out.println("------------Initializing privacy instance--------------");
		System.out.println("-------------------------------------------------------");
		
		List<ConfigurationProfile> configProfileList = privacyService.findPrinvacyInstance();
		
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
		
//		// ConfigurationProfile
//		configurationActor = new ConfigurationProfile();
//		
//		// Preferences
//		Preference privacyPreference = new Preference(0.2, 0.05);
//		Preference informationLossPreference = new Preference(0.1, 0.7);
//		Preference reIdentificationRiskPreference = new Preference(0.9, 0.05);
//
//		// Metrics
//		Metric informationLossMetric = new Metric(); //("n/a", "probe PRIVaaS","anonymizator");
//		informationLossMetric.setDescriptionName("n/a");
//		informationLossMetric.setProbeName("probe PRIVaaS");
//		informationLossMetric.setResourceName("anonymizator");
//		Metric reIdentificationRiskMetric = new Metric(); //("n/a", "probe PRIVaaS","anonymizator");
//		reIdentificationRiskMetric.setDescriptionName("n/a");
//		reIdentificationRiskMetric.setProbeName("probe PRIVaaS");
//		reIdentificationRiskMetric.setResourceName("anonymizator");
//		
//		// HistoricalData
//		HistoricalData privacyHistoricalData = new HistoricalData(); // TODO: busca dados no banco?
//		
//		// LeafAttributes
//		Leafattribute informationLoss = new Leafattribute(MetricNormalizationKind.BENEFIT, 1.0, 0.0, 1,
//				MetricAggregationOperator.AVERAGE);
//		Leafattribute reIdentificationRisk = new Leafattribute(MetricNormalizationKind.COST, 1.0, 0.0, 1,
//				MetricAggregationOperator.AVERAGE);
//		
//		informationLossMetric.setAttribute(informationLoss);
//		reIdentificationRiskMetric.setAttribute(reIdentificationRisk);
//		
//		// CompositeAttribute
//		CompositeAttribute privacy = new CompositeAttribute();
//		
//		privacyPreference.setAttribute(privacy);
//		
//		privacy.addAttribute(informationLoss);
//		privacy.addAttribute(reIdentificationRisk);
//		
//		informationLossPreference.setAttribute(informationLoss);
//		reIdentificationRiskPreference.setAttribute(reIdentificationRisk);
//		
//		configurationActor.addPreference(privacyPreference);
//		configurationActor.addPreference(informationLossPreference);
//		configurationActor.addPreference(reIdentificationRiskPreference);
//		
//		configurationActor.addMetric(informationLossMetric);
//		configurationActor.addMetric(reIdentificationRiskMetric);
//		
//		instance.setConfigurationActor(configurationActor);
		
		System.out.println("-------------------------------------------------------");
		System.out.println("--------------Privacy instance initialized-------------");
		System.out.println("-------------------------------------------------------");
	}

	public static PrivacyQualityModel getPrivacyInstance() {
		return instance;
	}

	public ConfigurationProfile getConfigurationActor() {
		return configurationActor;
	}

	public void setConfigurationActor(ConfigurationProfile configurationActor) {
		this.configurationActor = configurationActor;
	}

}

package eubrazil.atmosphere.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.service.PrivacyService;

@Component
public class PrivacyComponent {

	private static final PrivacyComponent INSTANCE = new PrivacyComponent();

	@Autowired
	private PrivacyService privacyService;

	public static PrivacyComponent getInstance() {
		return INSTANCE;
	}

	private PrivacyComponent() {
	}

	public List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName,
			Pageable numSamples) {
		return this.privacyService.getLimitedDataListByName(resourceName, probeName, descriptionName, numSamples);
	}
}

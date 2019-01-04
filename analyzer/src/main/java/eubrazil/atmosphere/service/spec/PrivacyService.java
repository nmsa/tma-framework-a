package eubrazil.atmosphere.service.spec;

import java.util.List;

import org.springframework.data.domain.Pageable;

import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.entity.Privacy;
import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;
import eubrazil.atmosphere.qualitymodel.HistoricalData;

public interface PrivacyService {

	public List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId,
			Pageable numSamples);

	public Privacy getLastMeasure();

	public void save(HistoricalData historicalData);

	public List<ConfigurationProfile> findPrinvacyInstance();

}

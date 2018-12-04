package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;

@Repository
public interface ConfigurationProfileRepository extends CrudRepository<ConfigurationProfile, Long> {
	
	@Override
	List<ConfigurationProfile> findAll();
	
}

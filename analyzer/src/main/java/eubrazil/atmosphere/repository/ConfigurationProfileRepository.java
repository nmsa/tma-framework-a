package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.qualitymodel.ConfigurationProfile;

@Repository
public interface ConfigurationProfileRepository extends CrudRepository<ConfigurationProfile, Long> {

	@Override
	List<ConfigurationProfile> findAll();

	@Query(value="select cp from configurationprofile cp left join fetch cp.metrics left join fetch "
			+ "cp.preferences where cp.configurationprofileId = 1")
    List<ConfigurationProfile> findPrinvacyInstance();

}

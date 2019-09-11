package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.Preference;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Repository
public interface PreferenceRepository extends CrudRepository<Preference, Long> {

	@Override
	Iterable<Preference> findAll();
	
	@Query(value="select p from preference p where p.attributeId = ?1")
    Preference findPreferenceById(int id);    
}
package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Privacy;

@Repository
public interface PrivacyRepository extends CrudRepository<Privacy, Long> {

	@Override
	List<Privacy> findAll();

	@Query(value="SELECT * FROM privacy p ORDER BY p.data_hora DESC", nativeQuery=true)
	List<Privacy> getLastMeasure();

}

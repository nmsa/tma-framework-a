package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.qualitymodel.Attribute;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Repository
public interface AttributeRepository extends CrudRepository<Attribute, Long> {

	@Override
	Iterable<Attribute> findAll();	
}
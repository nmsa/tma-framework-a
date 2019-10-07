package eubrazil.atmosphere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Repository
public interface MetricRepository extends CrudRepository<MetricAttributeView, Long> {

	@Override
	Iterable<MetricAttributeView> findAll();	
}
package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.Metric;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Repository
public interface MetricRepository extends CrudRepository<Metric, Long> {

	@Override
	Iterable<Metric> findAll();
	
	@Query(value="select m from Metric m where m.metricId = ?1")
    Metric findMetricById(int id);	
}
package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.MetricAttributeView;

@Repository
public interface MetricAttributeViewRepository extends CrudRepository<MetricAttributeView, Long> {

	@Query(value="SELECT m FROM MetricAttributeView m WHERE m.metricId = ?1")
	MetricAttributeView getMetricAttributeViewById(Integer id);
		
}

package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.MetricData;

@Repository
public interface MetricDataRepository extends CrudRepository<MetricData, Long> {

	@Override
	Iterable<MetricData> findAll();
	
	@Query(value="select md from MetricData md where md.metricId.metricId = ?1 and md.metricId.valueTime = (select max(md.metricId.valueTime) from MetricData md)")
    MetricData findlLastMetricDataById(int id);
}

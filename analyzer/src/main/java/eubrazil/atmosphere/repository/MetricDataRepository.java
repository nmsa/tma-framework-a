package eubrazil.atmosphere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.MetricData;

@Repository
public interface MetricDataRepository extends CrudRepository<MetricData, Long> {
	
}

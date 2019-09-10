package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Plan;

/**
 * Planning services
 * @author Jorge Luiz
 */
@Repository
public interface PlanRepository extends CrudRepository<Plan, Long> {

	@Query(value = "SELECT distinct p FROM Plan p WHERE p.metricId = ?1 and p.qualityModelId = ?2 order by p.valueTime desc")
	Plan getPlanIdByMetricAndConfigurationProfile(Integer metricId, Integer configurationProfileID);
	
}
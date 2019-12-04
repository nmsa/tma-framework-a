package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttributeView;

@Repository
public interface CompositeAttributeViewRepository extends CrudRepository<CompositeAttributeView, Long> {

	@Query(value="SELECT m FROM CompositeAttributeView m WHERE m.metricId = ?1")
	CompositeAttributeView getCompositeAttributeViewById(Integer id);
		
}

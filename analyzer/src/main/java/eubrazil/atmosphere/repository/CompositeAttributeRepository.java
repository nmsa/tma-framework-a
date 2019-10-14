package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.CompositeAttribute;

/**
 * Dashboard services
 * @author Felipe Gaia
 */
@Repository
public interface CompositeAttributeRepository extends CrudRepository<CompositeAttribute, Long> {

	@Override
	Iterable<CompositeAttribute> findAll();

	@Query(value="SELECT ca FROM CompositeAttribute ca WHERE ca.id.parentMetric = ca.id.childMetric")
    Iterable<CompositeAttribute> findAllRoots();
    
    @Query(value="SELECT ca FROM CompositeAttribute ca WHERE ca.id.parentMetric = ?1 AND ca.id.childMetric != ?1")
    Iterable<CompositeAttribute> findAllChildrenByParent(int id);
}
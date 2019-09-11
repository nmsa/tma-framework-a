package eubrazil.atmosphere.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.QualityModel;

@Repository
public interface QualityModelRepository extends CrudRepository<QualityModel, Long> {

	@Query(value="SELECT qm FROM QualityModel qm WHERE qm.id.qualityModelId = ?1")
	QualityModel getQualityModelById(Integer qualityModelId);
		
}

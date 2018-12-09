package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Data;
import eubrazil.atmosphere.qualitymodel.Metric;

@Repository
public interface MetricRepository extends CrudRepository<Metric, Long> {

	/**
	 * Search data list from knowledgedb by resource/probe/description name limited to @param pageable.
	 *
	 * Example of pageable usage:
	 * getLimitedDataListByName (..., new PageableRequest (0,10)); // limits search results to 10 items
	 *
	 * @param resourceName
	 * @param probeName
	 * @param descriptionName
	 * @param pageable
	 * @return
	 */
	@Query(value="SELECT m.data FROM metricqm m, data d WHERE m.attributeId = d.metric.attributeId and m.resourceName = ?1 and m.probeName = ?2 and m.descriptionName = ?3 order by d.id.valueTime desc")
	List<Data> getLimitedDataListByName(String resurceName, String probeName, String descriptionName, Pageable numSamples);

}

package eubrazil.atmosphere.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Data;

@Repository
public interface DataRepository extends CrudRepository<Data, Long> {

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
	@Query(value="SELECT d FROM data d WHERE d.metric.resourceName = ?1 and d.metric.probeName = ?2 and d.metric.descriptionName = ?3")
	List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName, Pageable numSamples);

}

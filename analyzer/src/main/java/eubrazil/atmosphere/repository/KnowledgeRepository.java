package eubrazil.atmosphere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.dashboard.Properties;

@Repository
public interface KnowledgeRepository extends CrudRepository<Properties, Long> {

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
//	@Query(value="SELECT d FROM data d WHERE d.resource.resourceName = ?1 and d.probe.probeName = ?2 and d.description.descriptionName = ?3")
//	List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName, Pageable pageable);
	
}

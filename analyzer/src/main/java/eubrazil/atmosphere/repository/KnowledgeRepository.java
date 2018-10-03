package eubrazil.atmosphere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Properties;

@Repository
public interface KnowledgeRepository extends CrudRepository<Properties, Long> {

	/**
	 * 
	 * 
	 * https://stackoverflow.com/questions/44565820/what-is-the-limit-clause-alternative-in-jpql
	 * 
	 * @param resourceName
	 * @param probeName
	 * @param descriptionName
	 * @param pageable
	 * @return
	 */
//	@Query(value="SELECT FROM Data d WHERE d.resource.resourceName = ?1 and d.probe.probeName = ?2 and d.description.descriptionName = ?3")
//	List<Data> getLimitedDataListByName(String resourceName, String probeName, String descriptionName, Pageable pageable);
	
}

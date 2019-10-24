package eubrazil.atmosphere.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubr.atmosphere.tma.entity.qualitymodel.Data;

@Repository
public interface DataRepository extends CrudRepository<Data, Long> {

	/**
	 * Search data list from knowledgedb by resource/probe/description id limited to @param pageable.
	 *
	 * Example of pageable usage:
	 * getLimitedDataListById (..., new PageRequest (0,10)); // limits search results to 10 items
	 *
	 * @param resourceName
	 * @param probeName
	 * @param descriptionName
	 * @param pageable
	 * @return
	 */
	@Query(value="SELECT d FROM Data d WHERE d.id.probeId = ?1 and d.id.descriptionId = ?2 and d.id.resourceId = ?3 order by d.id.valueTime desc")
	List<Data> getLimitedDataListById(Integer probeId, Integer descriptionId, Integer resourceId, Pageable numSamples);
	
	@Query(value="SELECT d FROM Data d WHERE d.id.probeId = ?1 and d.id.descriptionId = ?2 and d.id.resourceId = ?3 and d.id.valueTime = ?4")
	List<Data> getLimitedDataListByIdAndTimestamp(Integer probeId, Integer descriptionId, Integer resourceId, Date timestamp);

	@Query(value="SELECT d.value FROM Data d WHERE d.id.probeId = ?1 and d.id.descriptionId = ?2 and d.id.resourceId = ?3 order by d.id.valueTime desc")
	List<Double> getInstanceValueById(Integer probeId, Integer descriptionId, Integer resourceId);
	
}

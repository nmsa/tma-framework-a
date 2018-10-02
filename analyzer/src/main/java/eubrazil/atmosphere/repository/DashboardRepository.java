package eubrazil.atmosphere.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import eubrazil.atmosphere.entity.Properties;

@Repository
public interface DashboardRepository extends CrudRepository<Properties, Long> {
	
}

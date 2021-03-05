package com.Topcoder.rest.webservices.springbootjpapostgresql.Train;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TrainRepository extends JpaRepository<TrainModel, Long>{
	
}

package com.example.demo.repos;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.TripCabInfo;
@Repository
public interface TripCabInfoRepository extends MongoRepository<TripCabInfo, Long> {

	
	

	

}

package com.mongo.realestate.repositories;

import com.mongo.realestate.models.Land;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface LandRepository extends MongoRepository<Land, String> {

}

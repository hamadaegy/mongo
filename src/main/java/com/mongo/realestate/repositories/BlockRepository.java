package com.mongo.realestate.repositories;

import com.mongo.realestate.models.Block;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository extends MongoRepository<Block, String> {
}

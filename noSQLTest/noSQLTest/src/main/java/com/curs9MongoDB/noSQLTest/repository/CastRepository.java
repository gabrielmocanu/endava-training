package com.curs9MongoDB.noSQLTest.repository;

import com.curs9MongoDB.noSQLTest.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastRepository extends MongoRepository<Cast,String> {
}

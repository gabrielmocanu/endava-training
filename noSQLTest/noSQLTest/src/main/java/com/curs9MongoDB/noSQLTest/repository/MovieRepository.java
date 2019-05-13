package com.curs9MongoDB.noSQLTest.repository;

import com.curs9MongoDB.noSQLTest.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String> {


}

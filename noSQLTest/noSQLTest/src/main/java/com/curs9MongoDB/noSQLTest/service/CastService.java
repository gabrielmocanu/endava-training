package com.curs9MongoDB.noSQLTest.service;

import com.curs9MongoDB.noSQLTest.model.Cast;
import com.curs9MongoDB.noSQLTest.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CastService {

    @Autowired
    private CastRepository castRepository;

    public Cast save(Cast cast){
        return castRepository.save(cast);
    }
}

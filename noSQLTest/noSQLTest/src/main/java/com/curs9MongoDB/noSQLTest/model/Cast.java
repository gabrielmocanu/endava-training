package com.curs9MongoDB.noSQLTest.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cast {

    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    List<String> actors;
}

package com.curs9MongoDB.noSQLTest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Movie {

    @Id
    public String id;


    private int rating;

    private Cast cast;

    public Cast getCast() {
        return cast;
    }

    // Tema microserviciu -> Baza de date separate, user reomandations movies.

    private String title;
    private String genre;

    public void setCast(Cast cast) {
        this.cast = cast;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

package com.endava.demo.repository;

import com.endava.demo.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static java.sql.Types.NULL;

@Repository
public class MovieRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(Movie movie) {
        int id;
        if(getMaxId() == NULL)
            id = 0;
        else
            id = getMaxId();

        movie.setId(id+1);

        // It should be movie, but sanki
        String query = "INSERT into mobie values ( ?, ?, ?)";
        return jdbcTemplate.update(query,movie.getId(),movie.getTitle(),movie.getGenre());
    }

    private int getMaxId(){
        String query = "SELECT max(id) from mobie";
        return jdbcTemplate.queryForObject(query,Integer.class);
    }

    public int delete(int id) {
        String query = "DELETE from mobie where id = ?";
        return jdbcTemplate.update(query,id);
    }
}

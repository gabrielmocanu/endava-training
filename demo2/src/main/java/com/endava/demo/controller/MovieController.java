package com.endava.demo.controller;

import com.endava.demo.model.Movie;
import com.endava.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MovieController {

    // CRUD
    @Autowired
    private MovieService movieService;

    @Autowired
    private RestTemplate restTemplate;

// Create

    // Request Body - POST PUT UPDATE
    // Request Param -
    // PathVariabl
    //@RequestMapping(value="/", method = RequestMethod.POST)
    @PostMapping(value = "/")
    public int add(@RequestParam String title, @RequestParam String genre) {
        return movieService.add(title,genre);
    }
    @PostMapping(value = "/add")
    public String addMovie(@RequestBody Movie movie, HttpServletResponse httpServletResponse) {
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return movie.getTitle();
    }

        // Retrive
    // TODO get by ID
    // TODO get all

    // Update
    // TODO model -> rating

    // Delete
    @DeleteMapping(value = "/{id}")
    public int delete(@PathVariable int id){
        return movieService.delete(id);
    }

    @GetMapping("/")
    public void callRest() {
        String url = "http://localhost:8080/3";
        restTemplate.delete(url);
    }
}

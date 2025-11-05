package com.platzi.play.web.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platzi.play.persistence.crud.CrudMovieEntity;
import com.platzi.play.persistence.entity.MovieEntity;

@RestController
public class MovieController {

    private final CrudMovieEntity crudMovieEntity;
    
    public MovieController(CrudMovieEntity crudMovieEntity){
        this.crudMovieEntity = crudMovieEntity;
    }

    @GetMapping("/movies")    
    public List<MovieEntity> getAll(){
        return (List<MovieEntity>) this.crudMovieEntity.findAll();
    }


}

package com.movie.dao;

import com.movie.bean.Movie;
import java.util.List;

public interface MovieDao {

    void add(Movie movie);
    Movie findById(int id);
    List<Movie> findAll();
    boolean update(Movie movie);
    boolean delete(int id);
}

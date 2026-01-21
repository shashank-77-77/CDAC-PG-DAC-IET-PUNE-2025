package com.movie.service;

import com.movie.bean.Movie;
import java.util.List;

public interface MovieService {

    void add(Movie movie);
    Movie findById(int id);
    List<Movie> list();
    boolean update(Movie movie);
    boolean delete(int id);
}

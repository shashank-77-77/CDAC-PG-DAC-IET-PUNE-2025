package com.movie.service;

import com.movie.bean.Movie;
import com.movie.dao.MovieDao;
import com.movie.dao.MovieDaoImpl;
import java.util.List;

public class MovieServiceImpl implements MovieService {

    private MovieDao dao = new MovieDaoImpl();

    public void add(Movie movie) {
        dao.add(movie);
    }

    public Movie findById(int id) {
        return dao.findById(id);
    }

    public List<Movie> list() {
        return dao.findAll();
    }

    public boolean update(Movie movie) {
        return dao.update(movie);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }
}

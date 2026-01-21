package com.movie.dao;

import com.movie.bean.Movie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private List<Movie> store = new ArrayList<>();

    @Override
    public void add(Movie movie) {
        store.add(movie);
    }

    @Override
    public Movie findById(int id) {
        for (Movie m : store) {
            if (m.getId() == id)
                return m;
        }
        return null;
    }

    @Override
    public List<Movie> findAll() {
        return store;
    }

    @Override
    public boolean update(Movie updated) {
        Movie existing = findById(updated.getId());
        if (existing != null) {
            existing.setName(updated.name);
            existing.setGenre(updated.genre);
            existing.setReleaseYear(updated.releaseYear);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Iterator<Movie> it = store.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}

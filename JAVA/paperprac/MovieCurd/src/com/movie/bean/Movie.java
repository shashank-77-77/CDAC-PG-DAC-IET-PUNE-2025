package com.movie.bean;

public class Movie extends BaseEntity {

    public String name;
    public String genre;
    public int releaseYear;

    public Movie() {}

    public Movie(int id, String name, String genre, int releaseYear) {
        super(id);
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void setName(String name) { this.name = name; }
    public void setGenre(String genre) { this.genre = genre; }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie [id=" + id + ", name=" + name +
               ", genre=" + genre + ", year=" + releaseYear + "]";
    }
}

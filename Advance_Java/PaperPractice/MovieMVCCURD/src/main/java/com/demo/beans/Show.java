package com.demo.beans;

public class Show {
    private int id, movieId, availableSeats;
    private String showTime;
    private Movie movie;
    
    // Constructors, getters, setters (similar pattern)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getMovieId() { return movieId; }
    public void setMovieId(int movieId) { this.movieId = movieId; }
    public int getAvailableSeats() { return availableSeats; }
    public void setAvailableSeats(int availableSeats) { this.availableSeats = availableSeats; }
    public String getShowTime() { return showTime; }
    public void setShowTime(String showTime) { this.showTime = showTime; }
    public Movie getMovie() { return movie; }
    public void setMovie(Movie movie) { this.movie = movie; }
}

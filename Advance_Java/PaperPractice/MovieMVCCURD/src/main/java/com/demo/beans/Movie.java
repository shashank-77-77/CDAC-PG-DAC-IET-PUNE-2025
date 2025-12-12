package com.demo.beans;

public class Movie {
    private int id;
    private String title, genre;
    private double price;
    
    // Constructors
    public Movie() {}
    public Movie(int id, String title, String genre, double price) {
        this.id = id; this.title = title; this.genre = genre; this.price = price;
    }
    
    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

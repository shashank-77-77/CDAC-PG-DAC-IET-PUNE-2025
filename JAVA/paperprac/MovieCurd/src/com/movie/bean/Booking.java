package com.movie.bean;

public class Booking extends Movie {

    private String customerName;
    private int seats;

    public Booking(int id, String name, String genre, int releaseYear,
                   String customerName, int seats) {

        super(id, name, genre, releaseYear);
        this.customerName = customerName;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", movie=" + name +
               ", customer=" + customerName +
               ", seats=" + seats + "]";
    }
}

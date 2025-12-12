package com.demo.beans;

import java.sql.Timestamp;

public class Ticket {
    private int id, showId, seatsBooked;
    private String userEmail;
    private Timestamp bookingTime;
    
    // Constructors, getters, setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getShowId() { return showId; }
    public void setShowId(int showId) { this.showId = showId; }
    public int getSeatsBooked() { return seatsBooked; }
    public void setSeatsBooked(int seatsBooked) { this.seatsBooked = seatsBooked; }
    public String getUserEmail() { return userEmail; }
    public void setUserEmail(String userEmail) { this.userEmail = userEmail; }
    public Timestamp getBookingTime() { return bookingTime; }
    public void setBookingTime(Timestamp bookingTime) { this.bookingTime = bookingTime; }
}

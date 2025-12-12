package com.demo.dao;

import com.demo.beans.Ticket;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TicketDao {
    public boolean bookTicket(Ticket ticket) {
        String sql = "INSERT INTO tickets (show_id, user_email, seats_booked) VALUES (?, ?, ?)";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, ticket.getShowId());
            pstmt.setString(2, ticket.getUserEmail());
            pstmt.setInt(3, ticket.getSeatsBooked());
            
            int rows = pstmt.executeUpdate();
            if (rows > 0) {
                // Update available seats
                updateSeats(ticket.getShowId(), ticket.getSeatsBooked());
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    private void updateSeats(int showId, int seatsBooked) throws SQLException {
        String sql = "UPDATE shows SET available_seats = available_seats - ? WHERE id = ?";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, seatsBooked);
            pstmt.setInt(2, showId);
            pstmt.executeUpdate();
        }
    }
    
    public List<Ticket> getUserBookings(String email) {
    	List<Ticket> tickets = new ArrayList<Ticket>();

        String sql = "SELECT * FROM tickets WHERE user_email = ? ORDER BY booking_time DESC";
        
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Ticket ticket = new Ticket();
                ticket.setId(rs.getInt("id"));
                ticket.setShowId(rs.getInt("show_id"));
                ticket.setUserEmail(rs.getString("user_email"));
                ticket.setSeatsBooked(rs.getInt("seats_booked"));
                ticket.setBookingTime(rs.getTimestamp("booking_time"));
                tickets.add(ticket);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tickets;
    }
}

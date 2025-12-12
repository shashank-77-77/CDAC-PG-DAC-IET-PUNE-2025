package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Movie;
import com.demo.beans.Show;

public class ShowDao {
	public List<Show> getAllShows() {
	    List<Show> shows = new ArrayList<>();
	    String sql = "SELECT s.*, m.title, m.genre, m.price FROM shows s JOIN movies m ON s.movie_id = m.id";
	    
	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {
	        
	        while (rs.next()) {
	            Show show = new Show();
	            show.setId(rs.getInt("id"));
	            show.setMovieId(rs.getInt("movie_id"));
	            show.setShowTime(rs.getString("show_time"));
	            show.setAvailableSeats(rs.getInt("available_seats"));

	            Movie movie = new Movie();
	            movie.setId(rs.getInt("movie_id"));
	            movie.setTitle(rs.getString("title"));
	            movie.setGenre(rs.getString("genre"));
	            movie.setPrice(rs.getDouble("price"));
	            show.setMovie(movie);

	            shows.add(show);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return shows;
	}

}

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book Ticket</title>
    <style> body { font-family: Arial; max-width: 500px; margin: 50px auto; padding: 20px; } 
    input, select, button { width: 100%; padding: 12px; margin: 10px 0; } 
    button { background: #28a745; color: white; border: none; cursor: pointer; } </style>
</head>
<body>
    <h2>Book for: ${show.movie.title} - ${show.showTime}</h2>
    <form method="post" action="bookTicket">
        <input type="hidden" name="showId" value="${show.id}">
        <label>Price per seat: ₹${show.movie.price}</label><br>
        <label>Available seats: ${show.availableSeats}</label><br>
        
        <label>Your Email:</label>
        <input type="email" name="email" required>
        
        <label>Number of Seats (max 6):</label>
        <input type="number" name="seats" min="1" max="6" required>
        
        <button type="submit">Confirm Booking</button>
    </form>
    <a href="shows">← Back to Shows</a>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Available Shows</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        body { font-family: Arial; margin: 40px; }
        table { border-collapse: collapse; width: 100%; }
        th, td { border: 1px solid #ddd; padding: 12px; text-align: left; }
        th { background-color: #f2f2f2; }
        .book-btn { background: #007bff; color: white; padding: 8px 16px; text-decoration: none; }
    </style>
</head>
<body>
    <h1>🎬 Movie Ticket Booking</h1>
    <table>
        <tr>
            <th>Movie</th>
            <th>Genre</th>
            <th>Show Time</th>
            <th>Price</th>
            <th>Available Seats</th>
            <th>Action</th>
        </tr>
        <c:forEach var="show" items="${shows}">
            <tr>
                <td>${show.movie.title}</td>
                <td>${show.genre}</td>
                <td>${show.showTime}</td>
                <td>₹${show.movie.price}</td>
                <td>${show.availableSeats}</td>
                <td>
                    <a href="bookTicket?showId=${show.id}" class="book-btn">Book Now</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

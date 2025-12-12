<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmation</title>
    <style> body { font-family: Arial; text-align: center; margin: 100px; } 
    .success { color: green; background: #d4edda; padding: 20px; border-radius: 5px; }
    .error { color: red; background: #f8d7da; padding: 20px; border-radius: 5px; } </style>
</head>
<body>
    <c:choose>
        <c:when test="${booked == true}">
            <div class="success">
                <h2>🎉 Booking Confirmed!</h2>
                <p>Ticket ID: ${ticket.id}</p>
                <p>Seats booked: ${ticket.seatsBooked}</p>
                <p>Booking time: ${ticket.bookingTime}</p>
            </div>
        </c:when>
        <c:otherwise>
            <div class="error">
                <h2>❌ Booking Failed</h2>
                <p>Insufficient seats available. Please try again.</p>
            </div>
        </c:otherwise>
    </c:choose>
    <br><a href="shows">Book Another Ticket</a>
</body>
</html>

package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Show;
import com.demo.beans.Ticket;
import com.demo.service.BookingService;

@WebServlet("/bookTicket")
public class BookingController extends HttpServlet {
    private BookingService service = new BookingService();
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        int showId = Integer.parseInt(req.getParameter("showId"));
        Show show = service.getShowDetails(showId);
        req.setAttribute("show", show);
        req.getRequestDispatcher("/views/book.jsp").forward(req, resp);
    }
    
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        Ticket ticket = new Ticket();
        ticket.setShowId(Integer.parseInt(req.getParameter("showId")));
        ticket.setUserEmail(req.getParameter("email"));
        ticket.setSeatsBooked(Integer.parseInt(req.getParameter("seats")));
        
        boolean booked = service.bookTicket(ticket);
        req.setAttribute("booked", booked);
        req.setAttribute("ticket", ticket);
        req.getRequestDispatcher("/views/confirmation.jsp").forward(req, resp);
    }
}

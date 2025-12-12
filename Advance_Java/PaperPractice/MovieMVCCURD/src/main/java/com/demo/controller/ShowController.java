package com.demo.controller;

import com.demo.beans.Show;
import com.demo.service.BookingService;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shows")
public class ShowController extends HttpServlet {
    private BookingService service = new BookingService();
    
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        List<Show> shows = service.getAvailableShows();
        req.setAttribute("shows", shows);
        req.getRequestDispatcher("/views/shows.jsp").forward(req, resp);
    }
}

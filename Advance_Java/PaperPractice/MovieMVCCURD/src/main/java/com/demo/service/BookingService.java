package com.demo.service;

import com.demo.beans.Show;
import com.demo.beans.Ticket;
import com.demo.dao.ShowDao;
import com.demo.dao.TicketDao;
import java.util.List;

public class BookingService {
    private ShowDao showDAO = new ShowDao();
    private TicketDao ticketDAO = new TicketDao();
    
    public List<Show> getAvailableShows() {
        return showDAO.getAllShows();
    }
    
    public boolean bookTicket(Ticket ticket) {
        Show show = showDAO.getShowById(ticket.getShowId());
        if (show != null && show.getAvailableSeats() >= ticket.getSeatsBooked()) {
            return ticketDAO.bookTicket(ticket);
        }
        return false;
    }
    
    public Show getShowDetails(int showId) {
        return showDAO.getShowById(showId);
    }
}

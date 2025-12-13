package controllers;

import dao.LeaveDAO;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LeaveHistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int empNo = 101; // session-based in real systems

        try {
            req.setAttribute("history",
                new LeaveDAO().getLeaveHistory(empNo));
            req.getRequestDispatcher("history.jsp")
               .forward(req, res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

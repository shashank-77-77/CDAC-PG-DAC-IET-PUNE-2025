package controllers;

import dao.LeaveDAO;
import model.LeaveRequest;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;

public class ApplyLeaveServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        LeaveRequest lr = new LeaveRequest();
        lr.setEmpNo(Integer.parseInt(req.getParameter("empNo")));
        lr.setStartDate(Date.valueOf(req.getParameter("startDate")));
        lr.setEndDate(Date.valueOf(req.getParameter("endDate")));
        lr.setLeaveType(req.getParameter("leaveType"));
        lr.setReason(req.getParameter("reason"));

        try {
            new LeaveDAO().applyLeave(lr);
            res.sendRedirect("history");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

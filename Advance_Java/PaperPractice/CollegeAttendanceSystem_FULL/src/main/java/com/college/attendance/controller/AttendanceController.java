
package com.college.attendance.controller;

import com.college.attendance.bean.Attendance;
import com.college.attendance.service.AttendanceService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.Date;

public class AttendanceController extends HttpServlet {

    private AttendanceService service = new AttendanceService();

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        Attendance a = new Attendance();
        a.setStudentName(req.getParameter("studentName"));
        a.setSubject(req.getParameter("subject"));
        a.setDate(Date.valueOf(req.getParameter("date")));
        a.setStatus(req.getParameter("status"));

        service.addAttendance(a);
        res.sendRedirect("attendance");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String del = req.getParameter("delete");
        if (del != null) {
            service.delete(Integer.parseInt(del));
            res.sendRedirect("attendance");
            return;
        }

        req.setAttribute("list", service.getAll());
        req.getRequestDispatcher("attendance-list.jsp").forward(req, res);
    }
}

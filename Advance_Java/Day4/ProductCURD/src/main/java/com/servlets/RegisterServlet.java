package com.servlets;

import com.beans.MyUser;
import com.dao.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String uname = req.getParameter("uname");
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");
        String role = req.getParameter("role");

        Connection conn = null;
        PreparedStatement pst = null;

        try {
            conn = DBUtil.getMyConnection();
            pst = conn.prepareStatement("insert into user (uname, email, password, role) values (?, ?, ?, ?)");
            pst.setString(1, uname);
            pst.setString(2, email);
            pst.setString(3, pass);
            pst.setString(4, role);

            int n = pst.executeUpdate();
            if(n > 0) {
                out.print("<h1>Registration successful!</h1>");
                RequestDispatcher rd = req.getRequestDispatcher("Login.html");
                rd.include(req, resp);
            } else {
                out.print("<h1>Registration failed!</h1>");
                RequestDispatcher rd = req.getRequestDispatcher("register.html");
                rd.include(req, resp);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            out.print("<h1>Error: Unable to register</h1>");
        }
    }
}

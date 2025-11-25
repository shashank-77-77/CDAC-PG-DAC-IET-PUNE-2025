package com.servlets;

import com.dao.DBUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ForgotPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String unameoremail = req.getParameter("unameoremail");

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getMyConnection();
            pst = conn.prepareStatement("select password from user where uname=? or email=?");
            pst.setString(1, unameoremail);
            pst.setString(2, unameoremail);
            rs = pst.executeQuery();

            if(rs.next()) {
                String password = rs.getString(1);
                out.print("<h1>Your password is: " + password + "</h1>");
                RequestDispatcher rd = req.getRequestDispatcher("Login.html");
                rd.include(req, resp);
            } else {
                out.print("<h1>No user found with given information.</h1>");
                RequestDispatcher rd = req.getRequestDispatcher("forgotpassword.html");
                rd.include(req, resp);
            }
        } catch(Exception ex) {
            ex.printStackTrace();
            out.print("<h1>Error: Unable to retrieve password.</h1>");
        }
    }
}

package com.demo.dao;

import java.sql.*;

public class DBUtil {
    private static final String URL = "jdbc:mysql://192.168.10.117/dac83?useSSL=false";
    private static final String USER = "dac83";
    private static final String PASS = "welcome";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}

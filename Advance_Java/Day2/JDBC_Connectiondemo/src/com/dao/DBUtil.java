package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn=null;
	
	public static Connection getMyConnection()
	{
		if(conn==null)
		{
			try
			{
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.117/dac83?useSSL=false";
				conn=DriverManager.getConnection(url,"dac83","welcome");
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void closeMyConnection()
	{
		if(conn != null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
}

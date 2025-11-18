package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;

public class CallableStatmentTest {

	public static void main(String[] args) {
		Connection conn=null;
			
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.117/dac83?useSSL=false";
				conn=DriverManager.getConnection(url,"dac83","welcome");
				CallableStatement cst=conn.prepareCall("call getcnt(?,?)");
				cst.setInt(1, 10);
				cst.registerOutParameter(2,java.sql.Types.INTEGER);
				cst.execute();
				int cnt=cst.getInt(2);
				System.out.println("Count :" +cnt);
				 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			 
	
	}

}

package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class PrepareStatementTest {

	public static void main(String[] args) {
		Connection conn=null;
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			String url="jdbc:mysql://192.168.10.117/dac83?useSSL=false";
			conn=DriverManager.getConnection(url,"dac83","welcome");
			PreparedStatement pst=conn.prepareStatement("select * from dept");
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				System.out.println("Deptid" + rs.getInt(1));
				System.out.println("Dname" + rs.getString(2));
				System.out.println("Loc " + rs.getString(3));
				System.out.println("PWD " + rs.getString(4));
				System.out.println("Startedon" + rs.getString(5));
				System.out.println("---------------------------");		
			}
			PreparedStatement pst1=conn.prepareStatement("insert into dept values(?,?,?,?,?)");
			int deptid=100;
			String dname="java";
			String loc="pune";
			String pwd="puneiet@123";
			LocalDate ldt=LocalDate.now();
			String sqldate=ldt.toString();
			
			pst1.setInt(1, deptid);
			pst1.setString(2, dname);
			pst1.setString(3, loc);
			pst1.setString(4, pwd);
			pst1.setDate(5, java.sql.Date.valueOf(ldt));
			
			int n=pst1.executeUpdate();
			if(n>0)
			{
				System.out.println("Insertion done");
			}
			else
			{
				System.out.println("error");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}

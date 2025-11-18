package com.test;

import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateStatementTest {

	public static void main(String[] args) {
			Connection conn=null;
			
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.117/dac83?useSSL=false";
				conn=DriverManager.getConnection(url,"dac83","welcome");
				if(conn!=null) {
					System.out.println("connection done");
				}else {
					System.out.println("connection not done");
				}
				
				Statement st=conn.createStatement();
				ResultSet rs=st.executeQuery("select * from dept");
				while(rs.next())
				{
					System.out.println("Deptid" + rs.getInt(1));
					System.out.println("Dname" + rs.getString(2));
					System.out.println("Loc " + rs.getString(3));
					System.out.println("PWD " + rs.getString(4));
					System.out.println("Startedon" + rs.getString(5));
					System.out.println("---------------------------");		
				}
				int deptid=123;
				String dname="Software";
				String loc="Mumbai";
				String pwd="sss@123";
				LocalDate ldt = LocalDate.now();
				String sqlDate = ldt.toString();
				String query="insert into dept values("+deptid+",'"+dname+"','"+loc+"','"+pwd+"','"+sqlDate+"')";
				System.out.println(query);
				int n=st.executeUpdate(query);
				if(n>0)
				{
					System.out.println("Insertion Done");
				}
				else
				{
					System.out.println("Error");
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

	}

}

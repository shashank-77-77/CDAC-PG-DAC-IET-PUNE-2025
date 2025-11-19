package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			//step1
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//step2
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
			conn=DriverManager.getConnection(url,"root","root123");
			if(conn!=null) {
				System.out.println("connection done");
			}else {
				System.out.println("connection not done");
			}
			//step 3
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from myproduct");
			while(rs.next()) {
				
				System.out.println("Pid "+rs.getInt(1));
				System.out.println("Pname "+rs.getString(2));
				System.out.println("qty "+rs.getInt(3));
				System.out.println("Price "+rs.getDouble(4));
				System.out.println("Mfgdate "+rs.getDate(5));
				System.out.println("---------------------");
			}
			
		
			int pid=123;
			String pname="xxxxx";
			int qty=45;
			double price=456.78;
			LocalDate ldt=LocalDate.now();
			String sqlDate = ldt.toString();
			String query="insert into myproduct values("+pid+",'"+pname+"',"+qty+","+price+",'"+sqlDate+"')";
			System.out.println(query);
			int n=st.executeUpdate(query);
			if(n>0) {
				System.out.println("insertion done");
			}else {
				System.out.println("error");
			}
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}

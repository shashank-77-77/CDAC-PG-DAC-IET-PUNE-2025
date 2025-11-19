package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class TestPrepareStatement {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test?useSSL=false";
		    conn=DriverManager.getConnection(url,"root","root123");
		    PreparedStatement pst=conn.prepareStatement("select * from myproduct");
		    ResultSet rs=pst.executeQuery();
		    while(rs.next()) {
		    	System.out.println("pid:" +rs.getInt("pid"));
		    	System.out.println("pname:"+ rs.getString("pname"));
		    	System.out.println("qty"+rs.getInt("qty"));
		    	System.out.println("price:"+rs.getDouble("price"));
		    	System.out.println("mfgdate:"+rs.getDate("mfgdate"));
		    }
		    PreparedStatement pst1=conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
		    int pid=124;
			String pname="yyyyy";
			int qty=45;
			double price=456.78;
			LocalDate ldt=LocalDate.now();
			String sqlDate = ldt.toString();
			pst1.setInt(1, pid);
			pst1.setString(2, pname);
			pst1.setInt(3, qty);
			pst1.setDouble(4, price);
			pst1.setDate(5, java.sql.Date.valueOf(ldt));
			
			int n=pst1.executeUpdate();
			if(n>0) {
				System.out.println("insertion done");
			}else {
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

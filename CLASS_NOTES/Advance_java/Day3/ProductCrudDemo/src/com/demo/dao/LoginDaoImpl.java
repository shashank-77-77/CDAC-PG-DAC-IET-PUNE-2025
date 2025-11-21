package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.bean.MyUser;

public class LoginDaoImpl implements LoginDao{
     static Connection conn=null;
     static PreparedStatement seluser;
     static {
    	 
    	 try {
    		 conn=DBUtil.getMyConnection();
			seluser=conn.prepareStatement("select uname,email,role from user where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 
     }
	@Override
	public MyUser checkUser(String uname, String pass) {
		try {
			seluser.setString(1, uname);
			seluser.setString(2, pass);
			ResultSet rs=seluser.executeQuery();
			if(rs.next()) {
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
     
}

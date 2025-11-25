package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static {
		conn=DBUtil.getMyConnection();
		
	}
	@Override
	public List<Integer> findAllCategory() {
		try {
			PreparedStatement getcat=conn.prepareStatement("select distinct cid from product1 ");
            ResultSet rs=getcat.executeQuery();	
            List<Integer> clist=new ArrayList<>();
            while(rs.next())
            {
            	clist.add(rs.getInt(1));
            }
            return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Product> findByCategory(int cid) {
		try {
			PreparedStatement getprod=conn.prepareStatement("select * from product1 where cid=? ");
	        getprod.setInt(1, cid);
	        ResultSet rs =getprod.executeQuery();
	        List<Product> plist=new ArrayList<>();
	        while (rs.next())
	        {
	        	plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6)));
	           
	        }
	        return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

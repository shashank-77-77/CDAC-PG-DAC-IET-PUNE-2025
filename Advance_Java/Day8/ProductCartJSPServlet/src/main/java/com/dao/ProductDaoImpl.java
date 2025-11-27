package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.beans.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement selproduct,insproduct,selById,updateById,deleteById;
	
	static 
	{
		conn=DBUtil.getMyConnection();
		
		try {
			selproduct=conn.prepareStatement("Select * from myproduct");
			insproduct=conn.prepareStatement("insert into myproduct values(?,?,?,?,?,?)");
			selById=conn.prepareStatement("select * from myproduct where pid=?");
			updateById=conn.prepareStatement("update myproduct set pname=?,qty=?,price=?,expdate=?,cid=? where pid=?");
			deleteById=conn.prepareStatement("delete from myproduct where pid=?");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product>plist =new ArrayList<>();
		ResultSet rs;
		try {
			rs = selproduct.executeQuery();
			while(rs.next())
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

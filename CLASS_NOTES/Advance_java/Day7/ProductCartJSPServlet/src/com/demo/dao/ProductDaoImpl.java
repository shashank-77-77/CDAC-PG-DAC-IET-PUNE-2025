package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.bean.Product;

public class ProductDaoImpl implements ProductDao{
	static Connection conn;
	static PreparedStatement selproduct,insproduct,selById,updateById,deleteById;
	
	static {
		conn=DBUtil.getMyConnection();
		try {
			selproduct=conn.prepareStatement("select * from product1");
			insproduct = conn.prepareStatement("insert into product1 values(?,?,?,?,?,?)");
			selById=conn.prepareStatement("select * from product1 where pid=?");
			updateById=conn.prepareStatement("update product1 set pname=?,qty=?,price=?,expdate=?,cid=? where pid=?");
			deleteById=conn.prepareStatement("delete from product1 where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findAllProducts() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=selproduct.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Product p) {
		// TODO Auto-generated method stub
		try {
			insproduct.setInt(1, p.getPid());
			insproduct.setString(2, p.getPname());
			insproduct.setInt(3, p.getQty());
			insproduct.setDouble(4, p.getPrice());
			insproduct.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			insproduct.setInt(6, p.getCid());
			int n = insproduct.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Product findById(int pid) {
		try {
			selById.setInt(1, pid);
			ResultSet rs=selById.executeQuery();
			if(rs.next()) {
			return new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean modifyproduct(Product p) {
		
		try {
			updateById.setString(1, p.getPname());
			updateById.setInt(2, p.getQty());
			updateById.setDouble(3, p.getPrice());
			updateById.setDate(4, java.sql.Date.valueOf(p.getExpdate()));
			updateById.setInt(5, p.getCid());
			updateById.setInt(6, p.getPid());
			int n = updateById.executeUpdate();
		return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeById(int pid) {
		try {
			deleteById.setInt(1, pid);
			int n=deleteById.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

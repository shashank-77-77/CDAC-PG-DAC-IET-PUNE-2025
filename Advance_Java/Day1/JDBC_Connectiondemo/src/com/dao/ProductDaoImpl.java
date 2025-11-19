package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.Product;

public class ProductDaoImpl implements ProductDao{
	
	static Connection conn;
	static PreparedStatement insProd,findProd,findById,updateById,deleteById,sortByPrice;
	static
	{
		try {
			conn=DBUtil.getMyConnection();
			insProd=conn.prepareStatement("Insert into MyProduct Value (?,?,?,?,?)");
			findProd=conn.prepareStatement("Select * from MyProduct");
			findById=conn.prepareStatement("Select * from MyProduct Where pid = ?");
			updateById=conn.prepareStatement("update MyPorduct Set qty=? ,price=? where pid=?");
		    deleteById=conn.prepareStatement("delete from MyProduct where pid=?");
		    sortByPrice=conn.prepareStatement("Select * from MyProduct Order By price");
		    
					
		}
		catch (SQLException e)
		{
			e.printStackTrace(); 
		}
	}

	@Override
	public boolean save(Product p) {
		try {
			insProd.setInt(1,p.getPid());
			insProd.setString(2,p.getPname());
			insProd.setInt(3,p.getQty());
			insProd.setDouble(4,p.getPrice());
			insProd.setDate(5,java.sql.Date.valueOf(p.getLdt()));
			int n=insProd.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean removeById(int id) {
		
		return false;
	}

	@Override
	public boolean updateById(int id, int qty, double price) {
		try {
			updateById.setInt(1, qty);
			updateById.setDouble(2, price);
			updateById.setInt(3, id);
			int n=updateById.executeUpdate();
			if(n>0)
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return false;
	}
	
	
}

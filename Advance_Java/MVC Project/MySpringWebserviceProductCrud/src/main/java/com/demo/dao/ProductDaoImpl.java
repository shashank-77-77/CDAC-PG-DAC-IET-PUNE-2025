package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.demo.beans.Product;
import com.demo.dto.ProductDto;

@Service
public class ProductDaoImpl implements ProductDao {
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public List<Product> findAllProducts() {
		List<Product> plist=jdbctemplate.query("select * from myproduct", (rs,numrows)->{
			Product p=new Product();
			p.setPid(rs.getInt(1));
			p.setPname(rs.getString(2));
			p.setQty(rs.getInt(4));
			p.setPrice(rs.getDouble(3));
			if(rs.getDate(5)==null) {
				p.setMfgdate(null);
			}else {
			    p.setMfgdate(rs.getDate(5).toLocalDate());
			}
			p.setCid(rs.getInt(6));
			
			return p;
		});
		return plist;
	}

	
	public boolean save(Product p) {
		int n=jdbctemplate.update("insert into myproduct values(?,?,?,?,?,?)",new Object[]{
				p.getPid(),p.getPname(),p.getQty(),p.getPrice(),p.getMfgdate(),p.getCid()
		});
		return n>0;
	}


	public Product findById(int pid) {
		try
		{
			Product p=jdbctemplate.queryForObject("select * from myproduct where pid=?",new Object[] {pid},BeanPropertyRowMapper.newInstance(Product.class));
			return p;
		}catch(EmptyResultDataAccessException e)
		{
			System.out.println(e.getMessage());
			return null;
		}
		
	}

	
	public boolean modifyProduct(Product p) {
		int n=jdbctemplate.update("update myproduct set pname=?,qty=?,price=?,cid=? where pid=?",
				new Object[] {
						p.getPname(),p.getQty(),p.getPrice(),p.getCid(),p.getPid()
				});
		return n>0;
	}

	@Override
	public boolean removeById(int pid) {
		int n=jdbctemplate.update("delete from myproduct where pid=?",
				new Object[] {pid});
		return n>0;
	}



	
	
}

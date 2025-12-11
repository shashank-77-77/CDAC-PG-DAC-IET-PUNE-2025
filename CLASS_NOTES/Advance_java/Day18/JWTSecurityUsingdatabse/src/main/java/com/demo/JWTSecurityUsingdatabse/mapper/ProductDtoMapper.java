package com.demo.JWTSecurityUsingdatabse.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.demo.JWTSecurityUsingdatabse.beans.Product;
import com.demo.JWTSecurityUsingdatabse.dto.ProductDto;

public class ProductDtoMapper {
	public static Product mapToProduct(ProductDto p)
	{
		return new Product(p.getPid(),p.getPname(),p.getQty(),p.getPrice(),LocalDate.parse(p.getLdtstr(),DateTimeFormatter.ofPattern("dd/MM/yyyy")),p.getCid());
	}

	public static ProductDto mapToProductDto(Product prod)
	{
		if(prod.getExpdate()==null)
		{
			return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),null,prod.getCid());
		}
		return new ProductDto(prod.getPid(),prod.getPname(),prod.getQty(),prod.getPrice(),prod.getExpdate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),prod.getCid());
	}
}

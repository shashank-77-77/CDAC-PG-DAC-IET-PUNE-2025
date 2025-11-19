package com.test;

import java.util.Scanner;
import com.service.ProductService;

import com.service.ProductServiceImpl;

public class ProductManagementTest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int choice=0;
		ProductService pservice=new  ProductServiceImpl();
		do
		{
			System.out.println("1.add new product \n 2.delete product \n3.modify product");
			System.out.println("4. Find by Id \n 5.display all\n 6. Display in sorted order \n 7. Exit");
			System.out.println("choice :");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1-> {
				boolean status= pservice.addNewProduct();
				if(status)
				{
					System.out.println("Product added successfully");
					
				}
				else
				{
					System.out.println("Not Added");
				}	
			    }
			case 2->{ 
				System.out.println("Enter Id");
				int id=sc.nextInt();
				boolean status=pservice.deletebyId(id);
				if(status)
				{
					System.out.println("Product Deleted Succesfully");
				}else	{
					System.out.println("Not Deleted");
				}
				}
			case 3->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter qty");
				int qty=sc.nextInt();
				System.out.println("Enter price");
				double price=sc.nextDouble();
				
				boolean status=pservice.modifyById(id,qty,price);
				if(status)
				{
					System.out.println("Product updated successfully");
				}
				else
				{
					System.out.println("Not updated");
				}
	
				
			}
			
		}

	}while(choice!=7);

}
}

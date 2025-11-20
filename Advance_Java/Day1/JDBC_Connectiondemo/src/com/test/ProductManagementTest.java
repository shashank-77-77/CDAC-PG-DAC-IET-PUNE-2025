package com.test;

import java.util.List;
import java.util.Scanner;

import com.beans.Product;
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
			case 4->{
				System.out.println("Enter Id");
				int id=sc.nextInt();
				Product p=pservice.getById(id);
				if(p==null) {
					System.out.println("Not Found");
				}else {
			      System.out.println(p);      
				}
			   }
			
			case 5->{
				List<Product> plst=pservice.getAllProduct();
				plst.forEach(System.out::println);
			}
			
			case 6->{
				List<Product> plst=pservice.sortByPrice();
				plst.forEach(System.out::println);
			}
			
			case 7 ->{
				System.out.println("Thankyou for Visiting.... ");
				sc.close();
				pservice.closeMyConnection();
			}
			
		}

	}while(choice!=7);

}
}






// Output :

//1.add new product 
//2.delete product 
//3.modify product
//4. Find by Id 
//5.display all
//6. Display in sorted order 
//7. Exit
//choice :
//5
//Product [pid=112, pname=Pen, qty=33, price=45.0, ldt=2025-01-12]
//Product [pid=113, pname=Pencil, qty=24, price=120.0, ldt=2025-12-24]
//Product [pid=114, pname=Book, qty=45, price=130.0, ldt=2024-12-12]
//Product [pid=114, pname=Notebook, qty=120, price=1450.0, ldt=2023-02-13]
//1.add new product 
//2.delete product 
//3.modify product
//4. Find by Id 
//5.display all
//6. Display in sorted order 
//7. Exit
//choice :
//6
//Product [pid=112, pname=Pen, qty=33, price=45.0, ldt=2025-01-12]
//Product [pid=113, pname=Pencil, qty=24, price=120.0, ldt=2025-12-24]
//Product [pid=114, pname=Book, qty=45, price=130.0, ldt=2024-12-12]
//Product [pid=114, pname=Notebook, qty=120, price=1450.0, ldt=2023-02-13]
//1.add new product 
//2.delete product 
//3.modify product
//4. Find by Id 
//5.display all
//6. Display in sorted order 
//7. Exit
//choice :
//1
//Enter pid
//117
//Enter product name 
//notepad
//Enter qty
//23
//Enter price
//100
//Enter mfgdate (dd/MM/yyyy
//12/12/2012
//Product added successfully
//1.add new product 
//2.delete product 
//3.modify product
//4. Find by Id 
//5.display all
//6. Display in sorted order 
//7. Exit
//choice :
//6
//Product [pid=112, pname=Pen, qty=33, price=45.0, ldt=2025-01-12]
//Product [pid=117, pname=notepad, qty=23, price=100.0, ldt=2012-12-12]
//Product [pid=113, pname=Pencil, qty=24, price=120.0, ldt=2025-12-24]
//Product [pid=114, pname=Book, qty=45, price=130.0, ldt=2024-12-12]
//Product [pid=114, pname=Notebook, qty=120, price=1450.0, ldt=2023-02-13]
//1.add new product 
//2.delete product 
//3.modify product
//4. Find by Id 
//5.display all
//6. Display in sorted order 
//7. Exit
//choice :
//7
//Thankyou for Visiting.... 

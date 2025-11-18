package com.demo.test;

import java.util.Scanner;

import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		ProductService pservice=new ProductServiceImpl();
		do {
			System.out.println("1. add new product\n2. delete product\n3. modify product");
			System.out.println("4.find by Id\n5. display all\n6. display in sorted order\n7. exit");
			System.out.println("choice :");
			choice=sc.nextInt();
			switch(choice) {
			case 1->{
				boolean status=pservice.addNewProduct();
				if(status) {
					System.out.println("product addedd successfully");
				}else {
					System.out.println("Not added");
				}
			}
			case 7->{
				System.out.println("Thank you for visiting .....");
				sc.close();
			}
			}
		}while(choice!=7);

	}

}

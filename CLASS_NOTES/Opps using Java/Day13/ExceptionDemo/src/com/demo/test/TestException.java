package com.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {
	private static int divide(int x, int y) {
		return x/y;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter a number");
			int num=sc.nextInt();
			System.out.println("Enter a number");
			int num1=sc.nextInt();
			//try {
				int ans=divide(num,num1);
				System.out.println("Division : "+ans);
			//}catch(ArithmeticException e) {
			//	System.out.println(e.getMessage());
			//}
			System.out.println("At the end of outer try block");
		}catch(InputMismatchException e) {
			System.out.println("Pls enter number");
			//e.printStackTrace();
			//sSystem.out.println(e.getMessage());
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("Error occured");
			System.out.println(e.getMessage());
		} 
		finally{
			System.out.println("in finally block");
		}

	}

	

}

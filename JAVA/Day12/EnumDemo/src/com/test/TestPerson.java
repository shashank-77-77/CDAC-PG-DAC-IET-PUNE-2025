package com.test;
import java.util.Scanner;

import com.beans.Person;
import com.enums.Gender;
public class TestPerson {
	
	public static void main(String[] args) {
		Person p=new Person(82,"Shashank",Gender.male);
		System.out.println(p);
		for(Gender g:Gender.values())
		{
			System.out.println(g);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int pid=sc.nextInt();
		System.out.println("Enter name");
		String pname=sc.next();
		System.out.println("Enter gender");
		String g=sc.next();
		Gender g1=Gender.valueOf(g);
		Person p2=new Person(pid,pname,g1);
		System.out.println(p2);
		System.out.println(Gender.valueOf(g));
		
	}

}

package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.enums.Gender;

public class TestPerson {
public static void main(String[] args) {
	Person p=new Person(11,"Shalini",Gender.female);
	System.out.println(p);
	for(Gender g:Gender.values()) {
		System.out.println(g);
	}
	Scanner sc=new Scanner(System.in);
	System.out.println("enetr id");
	int pid=sc.nextInt();
	System.out.println("enter name");
	String nm=sc.next();
	System.out.println("enetr gender");
	String g=sc.next();
	Gender g1=Gender.valueOf(g);
	Person p2=new Person(pid,nm,g1);
	System.out.println(p2);
	System.out.println(Gender.valueOf(g));
	
}
}

package com.test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import com.beans.Employee;

public class TestArrayList {

	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>(); //by default capacity is 10
		elist.add(new Employee(12,"Manas",45678,LocalDate.of(2025,02,20)));
		elist.add(new Employee(13,"Akshay",56678,LocalDate.of(2025,07,13)));
		elist.add(new Employee(12,"Tushar",35678,LocalDate.of(2025,03,19)));
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		System.out.println("===============================");
		for(Employee e:elist) {  
			System.out.println(e);  
		}
		System.out.println("===============================");
		Iterator<Employee> it=elist.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
		
		//it is bidirectional iterator
		ListIterator<Employee> it1=elist.listIterator();
		
		//1.8
		elist.forEach(System.out::println);
		//search by id
		int id=13;
		Optional<Employee> op=elist.stream().filter(emp->emp.getEmpid()==id).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Not found");
		}
	

	}

}

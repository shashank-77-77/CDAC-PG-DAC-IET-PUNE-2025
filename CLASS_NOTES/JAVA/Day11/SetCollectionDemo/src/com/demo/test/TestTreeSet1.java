package com.demo.test;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.Employee;

public class TestTreeSet1 {

	public static void main(String[] args) {
		//to add data in sorted order of name in TreeSet
		//if name is same then compare it on empid
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in name comparator "+ o1.getEname()+"---"+o2.getEname());
			if(o1.getEname().compareTo(o2.getEname())==0) {
				return o1.getEmpid()-o2.getEmpid();
			}
			return o1.getEname().compareTo(o2.getEname());
		};
		Set<Employee> tset=new TreeSet<>(c);
		tset.add(new Employee(107,"Rajan",45678,LocalDate.of(2020,11, 11)));
		tset.add(new Employee(101,"Revati",55678,LocalDate.of(2020,11, 11)));
		tset.add(new Employee(102,"Rajan",42678,LocalDate.of(2020,11, 11)));
		tset.add(new Employee(100,"Rajan",45678,LocalDate.of(2020,11, 11)));
        tset.forEach(System.out::println);
	}

}

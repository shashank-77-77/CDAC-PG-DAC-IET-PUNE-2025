package com.demo.comparators;

import java.util.Comparator;

import com.demo.beans.Employee;

public class MyNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("in nameComparator compare method");
		System.out.println("Names: "+o1.getEname()+"-----"+o2.getEname());
		return o1.getEname().compareTo(o2.getEname());
	}

}

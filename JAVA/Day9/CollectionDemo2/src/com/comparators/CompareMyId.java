package com.comparators;

import java.util.Comparator;

import com.beans.Employee;

public class CompareMyId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
			return e1.getEmpid()-e2.getEmpid();
	}
	

}

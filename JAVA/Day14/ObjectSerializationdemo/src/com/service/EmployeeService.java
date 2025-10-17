package com.service;

import java.util.List;

import com.beans.Employee;

public interface EmployeeService {

	void readFile(String fname);

	boolean addnewEmployee();

	boolean deletebyId(int empid);

	boolean updateById(int id, double sal);

	List<Employee> getAllData();

	Employee getById(int id);

	void writeToFile(String string);

	

}

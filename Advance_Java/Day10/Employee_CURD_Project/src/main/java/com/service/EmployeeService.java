package com.service;

import java.util.List;

import com.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> getAllEmployee();

	boolean deleteById(int empid);

	boolean UpdateEmpById(int empid, String name, double sal);

}

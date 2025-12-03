package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> getAllEmployee();

	boolean deleteById(int empid);

	boolean updateEmployeeById(int empid, String name, double sal);

	void closeMySessionFactory();

	boolean addProjectToEmployee(int eid, int pid);

	List<Employee> SortEmployeeBySalary();

}

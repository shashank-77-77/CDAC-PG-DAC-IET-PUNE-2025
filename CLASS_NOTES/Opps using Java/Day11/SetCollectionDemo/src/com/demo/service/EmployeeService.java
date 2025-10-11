package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	Set<Employee> displayAll();

	Employee displayById(int id);

	Set<Employee> displayByName(String nm);

	boolean deleteBySal(double sal);

	boolean deleteById(int id);

	boolean updateBySal(int id, double sal);

	List<Employee> sortBySal();

	Set<Employee> sortById();

	List<Employee> sortByName();

}

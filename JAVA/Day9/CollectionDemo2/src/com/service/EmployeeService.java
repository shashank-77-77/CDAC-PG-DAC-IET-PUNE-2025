package com.service;

import java.util.List;

import com.beans.*;
public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int eid);

	boolean deleteById(int eid);

	List<Employee> findByName(String nm);

	boolean updateSal(int id, double sal);

	boolean deleteBySal(double sal);

	List<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> searchByName(String s1);

	boolean deleteByName(String n1);

}

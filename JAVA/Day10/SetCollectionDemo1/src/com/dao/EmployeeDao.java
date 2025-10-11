package com.dao;

import java.util.List;
import java.util.Set;

import com.beans.Employee;

public interface EmployeeDao {



	boolean save(Employee e);

	Set<Employee> displayAll();

	Employee searchById(int id);

	Set<Employee> searchByName(String nm);

	boolean updateSal(int id, double sal);

	boolean deleteById(int id);

	boolean deleteBySal(double sal);

	Set<Employee> sortById();

	List<Employee> sortBySal();

	List<Employee> sortByName();

	



}

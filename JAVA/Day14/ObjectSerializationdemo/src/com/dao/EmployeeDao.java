package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {

	Object readFile(String fname);

	boolean save(Employee e1);

	boolean deletebyId(int empid);

	boolean updateById(int id, double sal);

	List<Employee> getAllData();

	Employee getById(int id);

	Object writeToFile(String fname);

}

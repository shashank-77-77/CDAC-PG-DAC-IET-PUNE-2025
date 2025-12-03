package com.dao;

import java.util.List;

import com.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmployee();

	boolean removeById(int empid);

	boolean modifyEmployeeById(int empid, String name, double sal);

}

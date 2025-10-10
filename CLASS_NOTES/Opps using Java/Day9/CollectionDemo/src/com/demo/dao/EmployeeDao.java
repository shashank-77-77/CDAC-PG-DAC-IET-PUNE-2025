package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int eid);

	boolean removeById(int eid);

	List<Employee> findByName(String nm);

	boolean modifyById(int eid, double sal);

	boolean removeBySalary(double sal);

	List<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	List<Employee> sortById();

}

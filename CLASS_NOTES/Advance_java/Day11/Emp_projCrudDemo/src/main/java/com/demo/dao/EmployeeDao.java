package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAllEmployee();

	boolean removeById(int empid);

	boolean modifyEmployeeById(int empid, String name, double sal);

	void closeMySessionFactory();

	boolean addextraProjectToEmployee(Employee e, Project p);

	Employee findById(int eid);

	List<Employee> sortBySalary();

}

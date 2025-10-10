package com.dao;
import java.util.List;

import com.beans.*;
public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int eid);

	boolean removeById(int eid);

	List<Employee> findByName(String nm);

	boolean updateSal(int eid, double sal);

	boolean deleteBySal(double sal);

	List<Employee> findBySal(double sal);

	List<Employee> sortBySal();

	List<Employee> searchByName(String s1);

	boolean deleteByName(String n1);

}

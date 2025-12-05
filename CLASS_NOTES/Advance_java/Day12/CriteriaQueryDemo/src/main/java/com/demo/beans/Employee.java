package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp1")
public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	private String ename;
	private double salary;
	private String dept;
	private int age;
	public Employee() {
		super();
	}
	public Employee(int empid, String ename, double salary, String dept, int age) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}
	
	public Employee(String ename, double salary, String dept, int age) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
		this.age = age;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + ", age="
				+ age + "]";
	}
	

}

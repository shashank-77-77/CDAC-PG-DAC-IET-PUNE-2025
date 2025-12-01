package com.demo.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Emp")
public class Employee {
	@Id
   private int empid;
   private String ename;
   private LocalDate hiredate;
   private double sal;
   @ManyToOne(fetch=FetchType.LAZY)
   @JoinColumn(name="deptid")
   private Department dept;

public Employee() {
	super();
}

public Employee(int empid, String ename, LocalDate hiredate, double sal, Department dept) {
	super();
	this.empid = empid;
	this.ename = ename;
	this.hiredate = hiredate;
	this.sal = sal;
	this.dept = dept;
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

public LocalDate getHiredate() {
	return hiredate;
}

public void setHiredate(LocalDate hiredate) {
	this.hiredate = hiredate;
}

public double getSal() {
	return sal;
}

public void setSal(double sal) {
	this.sal = sal;
}

public Department getDept() {
	return dept;
}

public void setDept(Department dept) {
	this.dept = dept;
}

@Override
public String toString() {
	return "Employee [empid=" + empid + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal 
			+ "]";
}
   
   
}

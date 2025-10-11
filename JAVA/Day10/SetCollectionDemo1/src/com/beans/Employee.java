package com.beans;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private LocalDate jdt;
	
	public Employee(int empid, String ename, double sal, LocalDate jdt) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.jdt = jdt;
	}

	public Employee(int empid) {
		super();
		this.empid=empid;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(empid);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals method"+this.empid+"----"+((Employee)obj).empid);
		return this.empid==((Employee)obj).empid;
	}

	public int getEpmid() {
		return empid;
	}

	public void setEpmid(int empid) {
		this.empid = empid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public LocalDate getJdt() {
		return jdt;
	}

	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
	}
	
	
//	@Override
//	public int compareTo(Employee o) {
//		System.out.println("in compareTo method "+this.empid+"-----"+o.empid);
//		//return o.empid-this.empid; //descending order
//		return this.empid-o.empid;  //asc ending order
//	}
	 
	

}

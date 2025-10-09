package com.beans;

import java.time.LocalDate;

public class Employee {

	private int empid;
	private String ename;
	private double sal;
	private LocalDate jdt;

	public Employee()
	{
		super();
	}
	
	public Employee(int empid)
	{
		this.empid=empid;
	}
	
	public Employee(int empid,String ename,double sal,LocalDate jdt)
	{
		super();
		this.empid=empid;
		this.ename=ename;
		this.sal=sal;
		this.jdt=jdt;
	}
	
	public boolean equals(Object ob)
	{
		System.out.println("in equals method"+this.empid+"   "+((Employee)ob).empid);
		return this.empid==((Employee)ob).empid;
	}
	
	public int getEmpid()
	{
		return empid;
	}
	
	public void setEmpid(int empid)
	{
		this.empid=empid;
	}
	
	public String getEname()
	{
		return ename;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	
	public double getSal()
	{
		return sal;
	}
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	
	public LocalDate getJdt()
	{
		return jdt;
	}
	
	public void setJdt(LocalDate jdt)
	{
		this.jdt=jdt;
	}
	
	public String toString()
	{
		return "Employee [empid= "+ empid +", ename=" + ename +", sal= "+ sal +" .jdt = "+jdt+"]";
	}
	
}




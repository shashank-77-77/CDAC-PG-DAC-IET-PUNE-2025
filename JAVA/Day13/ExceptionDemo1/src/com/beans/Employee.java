package com.beans;

import com.exceptions.NegativeSalException;

public class Employee {
	private int eid;
	private String name;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) throws NegativeSalException{
		if(sal < 0)
		{
			throw new NegativeSalException("Salary Cannot Be Negative");
		}
		else if(sal<4000)
		{
			throw new NegativeSalException("Salary Connot Be < 4000");
		}
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
	
}

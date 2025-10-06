package com.demo.beans;
import java.util.Date;

abstract public class Employee extends Person{
	private String dept;
	private String desg;
	
	public Employee() {
		super();
		System.out.println("in employee default constrctor");
	}
	
	public Employee(String emptype, String pname, Date bdate,String dept, String desg) {
	    //super will call parmetrised condtructor of Person
		super(emptype,pname,bdate);
		System.out.println("in Employee parametrised constructor");
		this.dept = dept;
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	abstract public double calculateSal(); 
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	

}

package com.demo.beans;
import java.util.Date;

public class ContractEmp extends Employee{
     private float hrs;
     private double charges;
	public ContractEmp() {
		super();
	}
	public ContractEmp( String pname, Date bdate,String dept, String desg,float hrs, double charges) {
		super("c",pname,bdate,dept,desg);
		this.hrs = hrs;
		this.charges = charges;
	}
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public double calculateSal() {
		return hrs*charges;
	}
	@Override
	public String toString() {
		return super.toString()+" ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
     
}

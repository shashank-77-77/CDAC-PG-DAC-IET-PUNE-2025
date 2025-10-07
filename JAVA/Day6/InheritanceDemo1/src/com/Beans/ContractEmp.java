package com.Beans;

import java.util.Date;

public class ContractEmp extends Employee{
	private float hrs;
	private double charges;
	
	public ContractEmp()
	{
		System.out.println("in Default Constructor of ContractEmp");
	}
	public ContractEmp(String pname,Date bdate,String dept,String desg,float hrs,double charges)
	{
		super("c",pname,bdate,dept,desg);
		this.hrs=hrs;
		this.charges=charges;
	}
	 public float getHrs()
	 {
		 return hrs;
	 }
	 public void setHrs(float hrs)
	 {
		 this.hrs=hrs;
	 }
	 public double getCharges()
	 {
		 return charges;
	 }
		public void setCharge(double charges2) {
			this.charges=charges2;
			
		}
	 public double calculateSal()
	 {
		 return hrs * charges;
	 }
	@Override
	public String toString() {
		return super.toString()+ "ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}

	 
	 
}

package com.Beans;

import java.util.Date;

public class SalariedEmp extends Employee {
	private double sal;
	private double bonus;
	
	public SalariedEmp()
	{
		System.out.println("In default constructor");
	}
	public SalariedEmp(String pname,Date bdate,String dept,String desg,double sal)
	{
		super("s",pname,bdate,dept,desg);
		this.sal=sal;
		this.bonus=sal * 0.10;
		
	}
	
	public double getSal()
	{
		return sal;
	}
	
	public void setSal(double sal)
	{
		this.sal=sal;
	}
	public double getBouns()
	{
		return bonus;
	}
	public void setBonus(double bouns)
	{
		this.bonus=bonus;
	}
	
	public double calculateBonus(float percent)
	{
		bonus=sal * percent;	
		return bonus;
	}
	
	public String toString()
	{
		return super.toString()+"SalariedEmp [sal=" + sal +", bonus=" + bonus + "]";	
		
	}
	public double calculateSal() {
		return bonus+sal+0.10*sal+0.15*sal-0.08*sal;
	}
	

}

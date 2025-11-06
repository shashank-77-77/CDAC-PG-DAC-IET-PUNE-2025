package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exceptions.NegativeSalaryException;

public class MyService {

	public void acceptData() throws NegativeSalaryException{
		Scanner sc=new Scanner(System.in);
		Employee emp=new Employee(12,"xxx",45677);
		emp.setSal(-2000);
		
	}

}

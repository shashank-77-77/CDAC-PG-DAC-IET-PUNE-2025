package com.service;

import com.beans.Employee;
import com.exceptions.NegativeSalException;

public class MyService {
	public void acceptData() throws NegativeSalException
	{
		Employee e1=new Employee(7,"Soham",45000);
//		e1.setSal(-2000);
		
		e1.setSal(3000);
		
	}
}

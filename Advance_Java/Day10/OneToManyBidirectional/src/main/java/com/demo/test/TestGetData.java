package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		System.out.println("before get");
		Department d=session.get(Department.class, 12);
		
		System.out.println("after get");
		System.out.println("-----------------------");
		System.out.println(d);
		System.out.println("before get employee");
		Employee e=session.load(Employee.class, 3);
		System.out.println("after get employee");
		System.out.println(e);
		System.out.println(e.getDept().getDname());
		
		

	}

}

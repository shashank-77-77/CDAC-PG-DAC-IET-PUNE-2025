package com.demo.test;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public class TestOneToMany {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.getCurrentSession();
		Transaction tr=session.beginTransaction();
		Department d=new Department(12,"Gaming","Pune");
		Department d1=new Department(13,"HR","Pune");
		Employee e1= new Employee(1,"Rajan",LocalDate.of(2020, 05, 12),356789,d);
		Employee e2= new Employee(2,"Atharva",LocalDate.of(2021, 06, 15),456789,d);
		Employee e3=new Employee(3,"Manjiri",LocalDate.of(2021, 06, 15),45678,d1);
		Employee e4=new Employee(4,"Vidya",LocalDate.of(2020, 06, 15),55678,d1);
		Set<Employee> set1=new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		Set<Employee> set2=new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		d.setEset(set1);
		d1.setEset(set2);
		session.save(d);
		session.save(d1);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		
		
		tr.commit();
		//session.close();
		sf.close();
		
		

	}

}

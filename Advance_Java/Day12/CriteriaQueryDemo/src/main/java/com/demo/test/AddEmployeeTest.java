package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;



public class AddEmployeeTest {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee("Shashank",45800,"CEO",26);
		Employee e2=new Employee("SOham",35400,"HR",24);
		Employee e3=new Employee("Patik",25000,"MANAGER",30);
		Employee e4=new Employee("Shila",20000,"TEAM LEADER",22);
		Employee e5=new Employee("Rohit",5800,"PEOUN",25);
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		tr.commit();
		session.close();
		sf.close();
		
	}

}

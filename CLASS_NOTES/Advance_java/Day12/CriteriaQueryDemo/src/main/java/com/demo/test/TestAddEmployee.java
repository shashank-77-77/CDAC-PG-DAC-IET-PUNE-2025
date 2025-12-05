package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestAddEmployee {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee("xxxx",34567,"HR",25);
		Employee e2=new Employee("yyyy",44567,"HR",26);
		Employee e3=new Employee("zzzz",54567,"Admin",25);
		Employee e4=new Employee("tttt",54900,"Admin",27);
		Employee e5=new Employee("yyyyy",58567,"UX",28);
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

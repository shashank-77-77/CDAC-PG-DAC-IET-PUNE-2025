package com.demo.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestMyUser {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Address a1=new Address(12,"F.S.Road","Pune Shivaji","412016");
		MyUser u1=new MyUser(19,"Akshu","102",a1);
		MyUser u2=new MyUser(20,"Manasi","203",a1);
		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();
		Session session2=sf.openSession();
		Transaction tr1=session2.beginTransaction();
		System.out.println("before get");

		MyUser u3=session2.get(MyUser.class,12); 
		MyUser u4=session2.load(MyUser.class,12);  
		System.out.println("after get");
		System.out.println(u3);
		tr1.commit();
		session2.close();
		sf.close();

	}

}

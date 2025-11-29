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
		/*Address a1=new Address(12,"S.B.Road","Pune","411016");
		MyUser u1=new MyUser(12,"Ashu","11111",a1);
		MyUser u2=new MyUser(13,"Gauri","3333",a1);
		session.save(u1);
		session.save(u2);
		tr.commit();
		session.close();*/
		Session session2=sf.openSession();
		Transaction tr1=session2.beginTransaction();
		System.out.println("before get");
		//if object not found get will return null object, 
		//and load will throw an exception ObjectNotFound
		MyUser u11=session2.get(MyUser.class,12); //egar fetch
		//MyUser u11=session2.load(MyUser.class,12);  //lazy fetch
		System.out.println("after get");
		System.out.println(u11);
		tr1.commit();
		session2.close();
		sf.close();

	}

}

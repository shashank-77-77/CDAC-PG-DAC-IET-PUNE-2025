package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product;

public class TestMyuser {
	public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	MyUser u1=new MyUser(83,"Sham","ss12@gmail.com");
	MyUser u2=new MyUser(83,"Ram","rr123@gmail.com");
	Product p1=new Product("Lays",32,1200);
	Product p2=new Product("kurkure",40,1300);
	session.save(u1);
	session.save(u2);
	tr.commit();
	session.close();
	sf.close();
}

}

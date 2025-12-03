package com.demo.test;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.NonPerishable;
import com.demo.beans.PerishableProduct;
import com.demo.beans.Product;

public class TestSingleTable {
public static void main(String[] args) {
	SessionFactory sf=new Configuration().configure().buildSessionFactory();
	Session session=sf.openSession();
	Transaction tr=session.beginTransaction();
	Product p2=new Product(10,"biscuits",23,45,LocalDate.of(2020,05,05));
	Product p=new PerishableProduct(11,"lays",34,45,LocalDate.of(2025,11,11),LocalDate.of(2025,12,11));
	Product p1=new NonPerishable(12,"chair",37,4567,LocalDate.of(2025,11,11),11);
	session.save(p2);
	session.save(p);
	session.save(p1);
	tr.commit();
	session.close();
	sf.close();
}
}

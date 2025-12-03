package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sf=null;
	
	public static SessionFactory getMySessionFactory() {
		if(sf == null) {
			sf=new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	public static void closeMySessionFactory() {
		sf.close();
	}

}

package com.demo.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static SessionFactory sf;
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	@Override
	public boolean save(Employee e) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.saveOrUpdate(e);
		tr.commit();
		session.close();
		return true;
		
		
	}

}

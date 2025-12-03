package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static SessionFactory sf;
	static
	{
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

	@Override
	public List<Employee> findAllEmployee() {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		List <Employee> elist=session.createQuery("from Employee",Employee.class).list();
		tr.commit();
		session.close();
		return elist;
	}

	@Override
	public boolean removeById(int empid) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		boolean flag=false;
		Employee e=session.get(Employee.class, empid);
		if(e!=null) {
			session.delete(e);
			flag=true;
		}
		tr.commit();
		session.close();
		return flag;
		
	}

	@Override
	public boolean modifyEmployeeById(int empid, String name, double sal) {
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		boolean flag=false;
		Employee e=session.get(Employee.class,empid);
		if(e!=null)
		{
			e.setEname(name);
			e.setSal(sal);
			session.merge(e);
			flag=true;
		}
		tr.commit();
		session.close();
		return flag;
	}

}

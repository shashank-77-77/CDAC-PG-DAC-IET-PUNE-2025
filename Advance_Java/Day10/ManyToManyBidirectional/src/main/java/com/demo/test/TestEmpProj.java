package com.demo.test;



import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestEmpProj {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Employee e1=new Employee(14,"amsh",LocalDate.of(2014,01,11),345);
		Employee e2=new Employee(15,"Radesham",LocalDate.of(2005,05,11),478);
		Employee e3=new Employee(16,"Rutvik",LocalDate.of(2078, 01,11),378);
		Employee e4=new Employee(17,"MamataBnarjee",LocalDate.of(2025, 12,11),678);
		Set<Employee> eset1=new HashSet<>();
		eset1.add(e1);
		eset1.add(e2);
		eset1.add(e3);
		Set<Employee> eset2=new HashSet<>();
		eset2.add(e4);
		eset2.add(e2);
		eset2.add(e3);
		Project p1=new Project(14,"p1",LocalDate.of(2023,11,01),eset1);
		Project p2=new Project(15,"p2",LocalDate.of(2024,12,01),eset2);
		Project p3=new Project(16,"p3",LocalDate.of(2022,03,03),eset1);
		Set<Project> pset1=new HashSet<>();
		pset1.add(p1);
		pset1.add(p3);
		e1.setPset(pset1);
		Set<Project> pset2=new HashSet<>();
		pset2.add(p1);
		pset2.add(p2);
		pset2.add(p3);
		e2.setPset(pset2);
		e3.setPset(pset2);
		Set<Project> pset3=new HashSet<>();
		pset3.add(p2);
		e4.setPset(pset3);
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		tr.commit();
		session.close();
		sf.close();

	}

}

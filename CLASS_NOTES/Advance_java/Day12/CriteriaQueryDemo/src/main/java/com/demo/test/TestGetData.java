package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestGetData {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		//basic criteria setup
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		
		//fetch employees with salary>50000 and dept="HR"
			
		/*cq.select(root)
		.where(cb.or(
		        cb.equal(root.get("age"), 25),
				cb.equal(root.get("dept"), "HR"))
		);
		
		List<Employee> elist=session.createQuery(cq).getResultList();
		elist.forEach(System.out::println);*/
		
		//fetch all employee with dept ="Admin" and (salary>50000 or age<30)
		/*cq.select(root)
		  .where(
		      cb.and(
		          cb.equal(root.get("dept"), "Admin"),
		          cb.or(
		              cb.gt(root.get("salary"), 50000.00),
		              cb.lt(root.get("age"), 30)
		          )
		      )
		  );

		List<Employee> elist = session.createQuery(cq).getResultList();
		elist.forEach(System.out::println);*/
		
		//to get dept= "HR" and salary >40000 and age<30
		/*Predicate p1=cb.equal(root.get("dept"), "HR");
		Predicate p2=cb.gt(root.get("salary"), 40000);
		Predicate p3=cb.lt(root.get("age"), 30);
		
		cq.where(cb.and(p1,p2,p3));
		List<Employee> elist = session.createQuery(cq).getResultList();
		elist.forEach(System.out::println);
		*/
		/*Scanner sc=new Scanner(System.in);
		List<Predicate> predicates = new ArrayList<>();
        System.out.println("enetr dept");
        String dept=sc.next();
		if (dept != null)
		    predicates.add(cb.equal(root.get("dept"), dept));
		System.out.println("enetr min salary");
        int minSalary=sc.nextInt(); 
		if (minSalary != 0)
		    predicates.add(cb.gt(root.get("salary"), minSalary));
		System.out.println("enetr max age");
        int maxage=sc.nextInt();
		if (maxage != 0)
		    predicates.add(cb.lt(root.get("age"), maxage));

		cq.where(cb.and(predicates.toArray(new Predicate[0])));*/
		
		cq.where(
			    cb.or(
			        cb.like(root.get("ename"), "x%"),
			        cb.like(root.get("ename"), "z%")
			    )
			);
		List<Employee> elist = session.createQuery(cq).getResultList();
		elist.forEach(System.out::println);

		
		tr.commit();
		session.close();
		sf.close();

	}

}

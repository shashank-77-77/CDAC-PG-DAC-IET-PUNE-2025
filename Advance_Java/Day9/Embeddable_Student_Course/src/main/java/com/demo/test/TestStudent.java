package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Student;

public class TestStudent {
	
	
	public static void main(String[] args) {
		
	
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		Course c1=new Course(101,"Java");
		Course c2=new Course(102,"C-DAC");
		
		Student s1=new Student(1,"shashank","sss@gmail.com",c1);
		Student s2=new Student(2,"soham","s12@gmail.com",c1);
		Student s3=new Student(3,"yuvraj","yuvraj123@gmail.com",c2);
		Student s4=new Student(4,"rohit","rohit1@gmail.com",c2);
		
		Set<Student> set1=new HashSet<Student>();
		set1.add(s1);
		set1.add(s2);
		
		Set<Student> set2=new HashSet<Student>();
		set2.add(s3);
		set2.add(s4);
		c1.setSset(set1);
		c2.setSset(set2);
		
		session.save(c1);
		session.save(c2);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		tr.commit();
		sf.close();
		
		

}
}
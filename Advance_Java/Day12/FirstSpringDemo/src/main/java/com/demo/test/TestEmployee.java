package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;
import com.demo.bean.MyUser;

public class TestEmployee {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Employee e=(Employee) ctx.getBean("emp1");
		System.out.println(e);
		
		Employee e1=(Employee) ctx.getBean("emp2");
		System.out.println(e1);
		
		MyUser u1=(MyUser) ctx.getBean("u1");
		System.out.println(u1);
		
		((ClassPathXmlApplicationContext)ctx).close();
		
		
	}

}

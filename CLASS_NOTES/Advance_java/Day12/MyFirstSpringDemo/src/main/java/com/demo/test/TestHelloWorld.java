package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Employee;
import com.demo.bean.HelloWorld;
import com.demo.bean.MyUser;

public class TestHelloWorld {

	public static void main(String[] args) {
     ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");		
     HelloWorld hwbean=(HelloWorld) ctx.getBean("hw");
     //Employee e=new Employee(12,"xxx",34567);
     /*Employee e= new Employee();
     e.setEid(12);
     e.setEname("xxxx");
     e.setSal(343434);*/
     Employee e=(Employee) ctx.getBean("emp1");
     String msg=hwbean.sayHello();
     System.out.println(e);
     
     Employee e1=(Employee) ctx.getBean("emp2");
     System.out.println(e1);
     System.out.println("Message : "+msg);
     
    MyUser u1=(MyUser)ctx.getBean("u1");
    System.out.println(u1);
     
     ((ClassPathXmlApplicationContext) ctx).close();
	}

}

package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.beans.Order;

public class TestLifeCycleMethods {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Order o1=(Order)ctx.getBean("ord1");
		System.out.println(o1);
		((ClassPathXmlApplicationContext)ctx).close();

	}

}

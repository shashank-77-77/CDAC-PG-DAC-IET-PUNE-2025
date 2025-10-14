package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import com.demo.beans.MyClass;


public class TestMyClass {

	public static void main(String[] args) {
		MyClass ob=new MyClass(12,100);
		Class cls=ob.getClass();
		Constructor[] carr=cls.getConstructors();
		for(Constructor c:carr) {
			System.out.println(c.getName());
			System.out.println(c.getParameters());
		}
		
		Method[] marr=cls.getMethods();
		for(Method m:marr) {
			System.out.println(m.getName());
			if(m.getName().equals("m1")) {
				try {
					m.invoke(ob, 12);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		Field[] farr=cls.getDeclaredFields();
		for(Field f:farr) {
			if(f.getName().equals("n1"))
				f.setAccessible(true);
			System.out.println(f.getName());
		}
		
		//to change value of private member in the class
		try {
			Field f=cls.getDeclaredField("n1");
			System.out.println("before changing");
			System.out.println(ob);
			f.setAccessible(true);
			f.set(ob,100);//ob.setN1(100)
			System.out.println("After changing");
			System.out.println(ob);
		} catch (NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

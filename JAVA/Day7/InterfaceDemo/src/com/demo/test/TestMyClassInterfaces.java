package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class TestMyClassInterfaces {
   public static void main(String[] args) {
	MyClass ob=new MyClass();
	ob.m2(10);
    I1 ob2=new MyClass();
    ob2.m1();
    ((MyClass) ob2).m3();
    I2 ob3=new MyClass();
    ((MyClass)ob3).m1();
    
   }
}

package com.demo.test;

import com.demo.beans.MyNewCompare;
import com.demo.interfaces.MyComparable;
import com.demo.interfaces.MyGeneric2;
import com.demo.interfaces.MyGenericClass;

public class TestFunctionalInterface {
  public static void main(String[] args) {
	 MyNewCompare ob=new MyNewCompare();
	 ob.compare(10, 20);
	 
	 //using Annonymous class
	 MyComparable ob1=new MyComparable() {
		
		@Override
		public int compare(int a, int b) {
			System.out.println("in annonymous class compare "+a+", "+b);
			return 0;
		}
	};
	int c=ob1.compare(110, 220);
	
	
	MyComparable ob2=(x,y)->{
		System.out.println("in compare using lambda function "+x+", "+y);
		return 0;
	};
	int x=ob2.compare(100, 200);
	
	MyGenericClass<Integer> ob3=(x1,y1)->{
		return x1+y1;
	} ;
	System.out.println(ob3.compare(23, 45));
	MyGenericClass<String> ob4=(x1,y1)->{
		return x1+y1;
	} ;
	System.out.println(ob3.compare(23, 45));
	
	MyGeneric2<Integer> mg2=(a,b)->{
		return a+b+20;
	};
	//error
//	MyGeneric2<String> mg3=(a,b)->{
//		return a+b+20;
//	};
  }
  
}

package com.demo.interfaces;

@FunctionalInterface
public interface MyComparable {
         int compare(int a,int b);
         
         public static void m3() {
        	 System.out.println("in m3 static method");
         }
         default int m1(){
        	 return 10;
         }
}

package com.demo.beans;

public class MyTestClass {
	//variable number of parameters 
	public int add(int x,int...arr) {
		int sum=x;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
	}
	
	public int max(int x,int y) {
		return x>y?x:y;
	}
	public int max(int x,int y,int z) {
		
		return x>y?(x>z?x:z):(y>z?y:z);
	}
	
	public float max(float x,float y) {
		return x>y?x:y;
	}
	
	public String max(String x,String y) {
		return x.length()>y.length()?x:y;
	}

}

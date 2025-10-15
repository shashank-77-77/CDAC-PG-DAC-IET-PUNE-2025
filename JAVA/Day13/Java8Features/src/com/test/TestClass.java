package com.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class TestClass {
	public static void main(String[] args) {
		List<Integer> lst=List.of(3,5,4,15,16,30,20,45);
		Predicate<Integer> p1=e->e>15;
		lst.stream().filter(p1).forEach(System.out :: println);
		
		Supplier<String> s=()->{
			String[] str= {"Hi","Hello","Welcome","Testing"};
			int x=(int) Math.random()*2+1;
			return str[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
	}
}

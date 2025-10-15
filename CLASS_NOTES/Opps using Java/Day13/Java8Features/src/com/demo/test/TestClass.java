package com.demo.test;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestClass {

	public static void main(String[] args) {
		List<Integer> lst=List.of(3,2,4,15,26,33,7,4,5);
		Predicate<Integer> p1=e->e>10;
		lst.stream().filter(p1).forEach(System.out::println);
		
		
		Supplier<String> s=()->{String[] str={"Hello","Welcome","greet"};
		int x=(int) Math.random()*2+1;  // it always generates value<3
		
		return str[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		

	}

}

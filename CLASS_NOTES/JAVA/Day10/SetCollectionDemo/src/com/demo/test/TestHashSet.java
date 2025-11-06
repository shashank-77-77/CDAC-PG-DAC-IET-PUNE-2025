package com.demo.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String[] args) {
		Set<Integer> hset=new HashSet<>();
		hset.add(20);
		hset.add(10);
		hset.add(5);
		hset.add(1000);
		hset.add(200);
		System.out.println(hset.add(20));
		hset.add(10);
		System.out.println(hset);
		hset.remove(5);
		System.out.println(hset);
		//when foreach loop starts execution, 
		//then donot change the length of the collection
		for(Integer num:hset) {
			System.out.println(num);
		}
		
		Iterator<Integer> it=hset.iterator();
		while(it.hasNext()) {
			Integer ob=it.next();
			System.out.println(ob);
			
		}
		
		hset.forEach(System.out::println);
		
		
		
		
		
		
		

	}

}

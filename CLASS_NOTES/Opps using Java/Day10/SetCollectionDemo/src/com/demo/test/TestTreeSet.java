package com.demo.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		Set<Integer> tset=new TreeSet<>();
		tset.add(45);
		tset.add(56);
		tset.add(20);
		System.out.println(tset);
		
		for(Integer num:tset) {
			System.out.println(num);		
		
		}

		Iterator<Integer> it=tset.iterator();
		while(it.hasNext()) {
			Integer num=it.next();
			if(num==56) {
				System.out.println("56 deleted successfully");
				it.remove();
			}
			System.out.println(num);
		}
		
		tset.forEach(System.out::print);
		
	}

}

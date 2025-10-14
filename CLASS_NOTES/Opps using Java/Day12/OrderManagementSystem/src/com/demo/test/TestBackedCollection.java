package com.demo.test;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestBackedCollection {

	public static void main(String[] args) {
		Set<Integer> cset=new TreeSet<>();
		for(int i=1;i<=10;i++) {
			cset.add(i+20);
		}
		cset.forEach(System.out::println);
		SortedSet<Integer> hs=((SortedSet<Integer>) cset).headSet(25);
		System.out.println(hs);
		SortedSet<Integer> ts=((SortedSet<Integer>) cset).tailSet(25);
		System.out.println(ts);
		cset.add(15);
		cset.add(36);
		System.out.println(hs);
		System.out.println(ts);
		
		

	}

}

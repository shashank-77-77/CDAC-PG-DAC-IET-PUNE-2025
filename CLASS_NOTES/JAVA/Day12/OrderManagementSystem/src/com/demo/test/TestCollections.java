package com.demo.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TestCollections {

	public static void main(String[] args) {
		List<Integer> lst=Arrays.asList(12,23,45,67,89,12,13);
		//Collections.sort(lst);
		System.out.println(lst);
		System.out.println("Maximum: "+Collections.max(lst));
		System.out.println("Minimum: "+Collections.min(lst));
		Collections.shuffle(lst);
		System.out.println(lst);
		//shuffles the order of list
		Collections.shuffle(lst);
		System.out.println(lst);
		
		List<Integer> lst1=List.of(12,11,45,23,56);
		System.out.println(lst1);
		Map<Integer,String> cmap=Map.of(1,"a",2,"b",3,"c",4,"d");
		System.out.println(cmap);
		

	}

}

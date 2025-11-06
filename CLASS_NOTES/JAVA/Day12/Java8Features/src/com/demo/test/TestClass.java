package com.demo.test;

import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		List<Integer> lst=List.of(3,2,4,15,26,33,7,4,5);
		lst.stream().filter(e->e>10).forEach(System.out::println);

	}

}

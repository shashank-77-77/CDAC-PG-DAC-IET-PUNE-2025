package com.demo.test;

import java.util.stream.Stream;

public class StringFunctionTest {

	public static void main(String[] args) {
		String str="rain in SPAIN in plain";
		System.out.println("matches:"+str.matches(".*a.*n.*"));
		String s1="Happy Life";
		System.out.println("matches with :"+s1.matches(".*fe$"));

		boolean r = str.isBlank();
		System.out.println(r);
		str = "";
		r = str.isBlank();
		System.out.println(r);
		 str = "testing \n is a \r technical \n portal"; 
		 
        Stream<String> lines = str.lines();
        //lines.forEach(ln->System.out.println(ln));
        lines.forEach(System.out::println);
        String str1="      hello     ";
        
        System.out.println("using strip "+str1.strip());
        System.out.println("using stripleading "+str1.stripLeading());
        System.out.println("using stripTrailing "+str1.stripTrailing());
	}

}

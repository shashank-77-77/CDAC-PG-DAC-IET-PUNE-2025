package com.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamFunctions {
	
	public static void main(String[] args) {
		List<Integer> lst=List.of(12,23,45,19,10,34);
		//find maximum number
		Optional<Integer> maxnum=lst.stream().max(Integer::compare);
		System.out.println("Maximum number :" +maxnum.get());
		
		Optional<Integer> minnum=lst.stream().min(Integer::compare);
		System.out.println("Minimum number :" +minnum.get());
		
		maxnum=lst.stream().filter(e->e%2!=0).max(Integer::compare);
		System.out.println("Maximum odd number : "+maxnum.get());
		
		maxnum=lst.stream().filter(e->e%2==0).max(Integer::compare);
		System.out.println("Maximum even number :"+maxnum.get());
		
		Optional <Integer> op=lst.stream().filter(e->e>20).findFirst();
		if(op.isPresent())
		{
			System.out.println("First number > 20 :- " +op.get());
		}
		
		List<Integer> lst1=lst.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println("Square of the list : " +lst1);
		
		List<String> lstr=List.of("hiee","byeee","tata","welcome","testing");
		
		Optional<String> op1=lstr.stream().reduce((acc,s)->acc.length()>s.length()?acc:s);
		System.out.println(op1.get());
		
		
		boolean status=lst.stream().allMatch(e->{
			System.out.println("in All Match : "+e);
			return e>20;
			
		});
	  System.out.println(status);
		
		status=lst.stream().noneMatch(e->{
			System.out.println("In None Match : "+e);
			return e>15;
			
			
		});
		
		System.out.println(status);
		
	 status=lst.stream().anyMatch(e->{
		 System.out.println("in ANYMATCH :"+e);
		 return e>15;
	 });
			System.out.println(status);
		
		 
		
	}
}

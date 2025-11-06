package com.demo.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestStreamFunctions {

	public static void main(String[] args) {
		List<Integer> lst=List.of(23,17,45,67,34,11,34);
		//find maximum number
		Optional<Integer> maxnum=lst.stream().max(Integer::compare);
		System.out.println(maxnum.get());
		
		////find minimum number
		Optional<Integer> minnum=lst.stream().min(Integer::compare);
		System.out.println(minnum.get());
		
		//find maximum odd number
		maxnum=lst.stream().filter(e->e%2!=0).max(Integer::compare);
		System.out.println(maxnum.get());
		
		//find 1 st number > 5
		Optional<Integer> op=lst.stream().filter(e->e>5).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		
		
		//to find list of squares of all numbers
		List<Integer> lst1=lst.stream().map(e->e*e).collect(Collectors.toList());
		System.out.println(lst1);
		
		List<String> lstr=List.of("Hello","Welcome","Test","Check");
		
		Optional<String> op1=lstr.stream().reduce((acc,s)->acc.length()>s.length()?acc:s);
		System.out.println(op1.get());
		
		//all match returns true if all elements satisfy the condition
		//if it find one value which does not satisfy the condition, 
		//then it stops and return false
		boolean status=lst.stream().allMatch(e->{
			System.out.println("in all match "+e);
			return e>15;});
		System.out.println(status);
		
		//noneMatch returns true if all elements does not satisfy the condition
		//if it find one value which satisfy the condition, 
		//then it stops and return false
		status=lst.stream().noneMatch(e->{
			System.out.println("in None match "+e);
			return e>15;});
		System.out.println(status);
		
		//anyMatch returns true if any one  elements satisfy the condition
				//if it find one value which  satisfy the condition, 
				//then it stops and return true
		status=lst.stream().anyMatch(e->{
			System.out.println("in any match "+e);
			return e>15;});
		System.out.println(status);
		
		
		
		
		

	}

}

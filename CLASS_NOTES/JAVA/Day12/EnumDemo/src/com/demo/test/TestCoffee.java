package com.demo.test;

import com.demo.enums.Coffee;

public class TestCoffee {

	public static void main(String[] args) {
		Coffee c=Coffee.small;
		switch(c) {
		case small->{
			System.out.println("Small selected "+ c.getSize()+"---->"+c.getPrice());
		}
		case medium->{
			System.out.println("Medium selected"+ c.getSize()+"---->"+c.getPrice());
		}
		case large->{
			System.out.println("Large selected"+ c.getSize()+"---->"+c.getPrice());
		}
		}

	}

	

}

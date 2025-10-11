package com.demo.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<>();
		que.add(45);
		que.add(34);
		que.add(50);
		que.add(34);
		System.out.println(que);
		//peek reads but does not remove
		System.out.println(que.peek());
		while(!que.isEmpty()){
			//peek reads and remove
		    System.out.println(que.poll());
		}

	}

}

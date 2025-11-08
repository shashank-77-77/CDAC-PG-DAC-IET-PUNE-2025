package com.demo.test;

import com.demo.stacks.MyQueueList;

public class TestQueueList {

	public static void main(String[] args) {
		MyQueueList qlist=new MyQueueList();
		qlist.enQueue(12);
		qlist.enQueue(34);
		qlist.enQueue(3);
		qlist.enQueue(5);
		qlist.enQueue(16);
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue()); 
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());//queue is empty

	}

}

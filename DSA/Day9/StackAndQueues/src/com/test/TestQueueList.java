package com.test;

import com.stackandqueue.MyQueueLinkedList;

public class TestQueueList {

	
	public static void main(String[] args) {
		
	MyQueueLinkedList qlist=new MyQueueLinkedList();
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
	
	}

}

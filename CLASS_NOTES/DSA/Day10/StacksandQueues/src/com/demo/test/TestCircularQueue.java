package com.demo.test;

import com.demo.stacks.CircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue cqueue=new CircularQueue(5);
		cqueue.enQueue(4);
		cqueue.enQueue(41);
		cqueue.enQueue(42);
		cqueue.enQueue(43);
		cqueue.enQueue(44);
		cqueue.enQueue(4); //queue is full
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		cqueue.enQueue(421);
		cqueue.enQueue(431);
		cqueue.enQueue(422); //queue is full
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());//queue is empty

	}

}

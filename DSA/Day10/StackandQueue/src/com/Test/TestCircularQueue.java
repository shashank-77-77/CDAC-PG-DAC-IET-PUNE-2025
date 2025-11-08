package com.Test;

import com.StackandQueue.*;

public class TestCircularQueue {

	public static void main(String[] args) {
		CircularQueue cqueue=new CircularQueue(5);
		cqueue.enQueue(3);
		cqueue.enQueue(40);
		cqueue.enQueue(48);
		cqueue.enQueue(44);
		cqueue.enQueue(49);
		cqueue.enQueue(3);
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		cqueue.enQueue(455);
		cqueue.enQueue(465);
		cqueue.enQueue(475);
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());
		System.out.println(cqueue.deQueue());

	}

}

package com.demo.test;

import com.demo.linkedlists.SinglyLinkedList;

public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list1=new SinglyLinkedList();
		list1.addNode(12);
		list1.addNode(10);
		list1.addNode(15);
		list1.addNode(7);
		list1.addNode(2);
		list1.displayData();
		list1.addByPosition(1,100);
		list1.addByPosition(3, 200);
		//adding after last node
		list1.addByPosition(8, 300);
		//error check
		list1.addByPosition(20, 400);
		list1.displayData();
	}

}

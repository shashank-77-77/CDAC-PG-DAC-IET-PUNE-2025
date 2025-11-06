package com.testCircularLinkedList;

import com.linkedlists.DoublyCircularLinkedList;

public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {
		DoublyCircularLinkedList dlink=new DoublyCircularLinkedList();
		dlink.addNode(12);
		dlink.addNode(22);
		dlink.addNode(45);
		dlink.addNode(65);
		dlink.displayData();
		dlink.addByValue(33, 22);
		dlink.displayData();
		dlink.addByValue(66, 33);
		dlink.displayData();
		dlink.addByValue(77,45);
		dlink.displayData();

	}

}

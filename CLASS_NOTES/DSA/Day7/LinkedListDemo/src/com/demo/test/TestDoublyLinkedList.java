package com.demo.test;

import com.demo.linkedlists.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.addNode(12);
		dlist.displayData();
		dlist.addNode(15);
		dlist.displayData();
		dlist.addNode(13);
		dlist.displayData();

	}

}

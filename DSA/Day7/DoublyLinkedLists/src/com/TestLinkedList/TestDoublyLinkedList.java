package com.TestLinkedList;

import com.LinkedList.DoublyLinkedList;

public class TestDoublyLinkedList {

	public static void main(String[] args) {
		DoublyLinkedList dlink=new DoublyLinkedList();

		dlink.addByPosition(1, 10);
		dlink.addByPosition(1, 50);
		dlink.addByPosition(2, 20);
		dlink.addByPosition(3, 30);
		

		
		
		dlink.display();

	}

}

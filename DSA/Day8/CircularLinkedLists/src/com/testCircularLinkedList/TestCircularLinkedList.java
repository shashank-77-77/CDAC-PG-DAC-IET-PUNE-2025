package com.testCircularLinkedList;

import com.linkedlists.CircularLinkedList;

public class TestCircularLinkedList {

	public static void main(String[] args) {
		CircularLinkedList clist=new CircularLinkedList();
		clist.addNode(20);
		clist.addNode(30);
		clist.addNode(40);
		clist.displayData();
		clist.addByPosition(2,23);
		clist.addByPosition(3, 44);
		clist.displayData();
		clist.addByValue(11,30);
		clist.deleteByPosition(2);
		clist.deleteByValue(40);
		clist.displayData();
	}

}

package com.demo.linkedlists;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
				
	}
	public SinglyLinkedList() {
		head=null;
	}
	
	//add value after given num
	public void addByNum(int value,int num) {
		Node newNode=new Node(value);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
		//if num found
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		}else {
			System.out.println(num+"Not Found");
		}
		
	}
	//addByPosition
	public void addByPosition(int pos,int value) {
		Node newNode=new Node(value);
		if(pos==1) {
			//add at the head node
			newNode.next=head;
			head=newNode;
		}else {
			//add in between or at the end
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Given position "+pos+"  is beyond the length of the list");
			}
		}
	}
	//add at the end
	public void addNode(int value) {
		//create a new node
		Node newNode=new Node(value);
		//add at the head
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			//will keep on moving temp on right, till it reaches to last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			//add node at the end
			temp.next=newNode;
			
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"--->");
			}
			System.out.println("null");
		}
	}
	

}

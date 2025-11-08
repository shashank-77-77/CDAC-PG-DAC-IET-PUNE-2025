package com.demo.linkedlists;

import com.demo.linkedlists.SinglyLinkedList.Node;

public class CircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public CircularLinkedList() {
		head=null;
	}
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			//temp at the last node
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		newNode.next=head;
	}
	
	public void addByPosition(int pos,int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
		Node newNode=new Node(val);
		if(pos==1) {
			//place temp at the end
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			//add at the head node
			newNode.next=head;
			head=newNode;
			temp.next=head;
			
		}else {
			//add in between or at the end
			Node temp=head;
			int i=1;
			for(;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(i>pos-2) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Given position "+pos+"  is beyond the length of the list");
			}
		}
		}
	}
	
	public void addByValue(int val, int num) {
		Node newNode=new Node(val);
		if(head.data==num) {
			newNode.next=head.next;
			head.next=newNode;
		}else {
		    Node temp=head;
			do {
				temp=temp.next;
			}while(temp!=head && temp.data!=num);
			if(temp!=head) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println(num+" not found");
			}
		}
	}
	
	public void delteByPosition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				Node tail=head;
				while(tail.next!=head) {
					tail=tail.next;
			    }
				//if list has only one node and pos==1
				if(tail==head) {
					head=null;
				}else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(i==pos-1) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println("position not found");
				}
				
				
			}
		}
	}
	
	public void deleteByValue(int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(head.data==val) {
				Node tail=head;
				//place tail at the end
				while(tail.next!=head) {
					tail=tail.next;
			    }
				//if list has only one node and you want to delete the node
				if(tail==head) {
					head=null;
				}else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && temp.data!=val;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(val +" not found");
				}
				
				
			}
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			do{
			   System.out.print(temp.data+"--->");
			   temp=temp.next;
			}while(temp!=head);
		}
		System.out.println("head");
		
	}

}

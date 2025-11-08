package com.demo.linkedlists;

public class DoublyLinkedList {
    Node head;
    class Node{
    	int data;
    	Node prev,next;
		public Node(int data) {
			this.data = data;
			prev=null;
			next=null;
		}
    	
    }
	public DoublyLinkedList() {
		head=null;
	}
	
	public void addByValue(int val,int num) {
		Node newNode=new Node(val);
		Node temp=head;
		while(temp!=null && temp.data!=num)
			temp=temp.next;
		if(temp!=null) {
			newNode.next=temp.next;
			newNode.prev=temp;
			temp.next=newNode;
			if(newNode.next!=null) {
				newNode.next.prev=newNode;
			}
			
		}else {
			System.out.println(num+ " Not found");
		}
			
	}
	
	public void addByPosition(int pos,int val) {
		Node newNode=new Node(val);
		//add at the head node
		if(pos==1) {
			newNode.next=head;
			if(head!=null)
			    head.prev=newNode;
			head=newNode;
		}else {
			//add in between
			//add at the end
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				newNode.prev=temp;
				temp.next=newNode;
				if(newNode.next!=null) {
					newNode.next.prev=newNode;
				}
			}else {
				//given position is beyond the limit
				System.out.println(pos+" is beyond the limit");
			}
		}
		
		
	}
	public void deleteByValue(int val) {
		//value is at head node
		Node temp=head;
		if(head.data==val) {
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}else {
		//value found in between or at the end
		while(temp!=null && temp.data!=val) {
			temp=temp.next;
		}
		if(temp!=null) {
			temp.prev.next=temp.next;
			if(temp.next!=null) {
				temp.next.prev=temp.prev;
				temp.next=null;
			}
			temp.prev=null;
		}else {
			//value not found
			System.out.println(val+ " not found");
		}
			
		}
		
	}
	
	
    public void deleteByPosition(int pos) {
    	Node temp=head;
		if(pos==1) {
			head=temp.next;
			head.prev=null;
		}else {
			for(int i=0;temp!=null && i<pos-1;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				temp.prev=null;
			}else {
				System.out.println(pos + " is beyond the limit of the list");
			}
		}
	}
	
	
	public void addNode(int val) {
		Node newNode=new Node(val);
		//if list is empty add at the head
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			//place temp at the last node
			while(temp.next!=null) {
				temp=temp.next;
			}
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	
	public void displayDataReverse() {
		Node temp=head;
		//place temp at the last node
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+"--->");
			temp=temp.prev;
		}
		
	} 
	
	public void displayData() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"---->");
			temp=temp.next;
			
		}
		System.out.println("null");
	}
    
}

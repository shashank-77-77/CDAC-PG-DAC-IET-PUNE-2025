package com.demo.lists;

public class MyLinkedList {
     Node head;
     class Node{
    	 int data;
    	 //int weight;
    	 Node next;
		public Node(int data){//, int weight) {
			super();
			this.data = data;
			//this.weight=weight;
			this.next = null;
		}
    	 
     }
	public MyLinkedList() {
		head=null;
	}
	
	public void addNode(int num) { //,int wt) {
		Node newNode=new Node(num);
		if(head!=null) {
			newNode.next=head;
		}
		head=newNode;
	}
	
	public boolean search(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp=head;
			while(temp!=null && temp.data!=val) {
					temp=temp.next;
			}
			if(temp.data==val) {
				return true;
			}
			return false;
		
		}
	}
     
	public int[] getAdjescentNodes(int[] arr) {
		Node temp=head;
		for(int i=0;temp!=null && i<arr.length;i++) {
			arr[i]=temp.data;
			temp=temp.next;
		}
		return arr;
	}
	public void displayList() {
		if(head==null) {
			System.out.print("empty");
		}else {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
	}
}

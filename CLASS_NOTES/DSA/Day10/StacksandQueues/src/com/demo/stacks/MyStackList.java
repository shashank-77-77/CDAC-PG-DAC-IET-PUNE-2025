package com.demo.stacks;

public class MyStackList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public MyStackList() {
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int num) {
		Node newNode=new Node(num);
		  if(!isEmpty()) {
			newNode.next=top;
		  }
		  top=newNode;
		  System.out.println("pushed : "+num);
		}
	

    public int pop() {
    	if(!isEmpty()) {
    		Node temp=top;
    		top=top.next;
    		temp.next=null;
    		return temp.data;
    	}else {
    		System.out.println("Stack is empty");
    		return -1;
    	}
    	
    }
}	



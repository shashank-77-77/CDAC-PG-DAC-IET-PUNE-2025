package com.demo.stacks;



public class MyStackListGeneric<T> {
	Node top;
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public MyStackListGeneric() {
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(T num) {
		Node newNode=new Node(num);
		  if(!isEmpty()) {
			newNode.next=top;
		  }
		  top=newNode;
		  System.out.println("pushed : "+num);
		}
	

    public T pop() {
    	if(!isEmpty()) {
    		Node temp=top;
    		top=top.next;
    		temp.next=null;
    		return temp.data;
    	}else {
    		System.out.println("Stack is empty");
    		return null;
    	}
    	
    }
    
    
}

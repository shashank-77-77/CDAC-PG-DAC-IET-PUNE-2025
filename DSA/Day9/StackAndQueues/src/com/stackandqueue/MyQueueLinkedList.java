package com.stackandqueue;

public class MyQueueLinkedList {
	Node front;
	Node rear;
	class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{
			this.data = data;
			this.next=null;	
		}	
	}
	public MyQueueLinkedList() {
		this.front=null;
		this.rear=null;
	}
	
	public boolean isEmpty()
	{
		return front==null && rear==null;
	}
	
	public void enQueue(int val)
	{
		Node newnode= new Node(val);
		if(isEmpty())
		{
			front=newnode;
		}
		else
		{
			rear.next=newnode;
		}
		rear=newnode;
		System.out.println("Added num:" + val);
	}
	
	public int deQueue()
	{
		if(!isEmpty())
		{
			Node temp=front;
			front= front.next;
			if(front==null)
			{
				
				rear=null;
			}
			
			temp.next=null;
			return temp.data;
			
		}else {
			
			System.out.println("Queue Is empty");
			return -1;
		}
		
	}	
	
	
	

}

package com.stack;

public class MyGenericStackList<T> {
	Node top;
	class Node
	{
		T data;
		Node next;
		public Node(T data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public MyGenericStackList()
	{
		top=null;
	}
	
	public boolean  isEmpty()
	{
		return top==null;
	}
	
	public void push(T num)
	{
		Node newnode=new Node(num);
		if(!isEmpty())
		{
			newnode.next=top;
		}
		top=newnode;
		System.out.println("pushed : "+ num);
	}
	
	public T pop()
	{
		if(!isEmpty())
		{
			Node temp=top;
			top=top.next;
			temp.next=null;
			return temp.data; 
		}
		else
		{
			System.out.println("Stack is empty");
			return null;
		}
	}
}

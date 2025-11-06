package com.linkedlists;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next,prev;
		public Node(int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}		
	}
	
	public DoublyCircularLinkedList()
	{
		head=null;
	}
	
	
	
	
	
	public void addNode(int val)
	{
		Node newnode=new Node(val);
		if(head == null)
		{
			newnode.next = newnode;
	        newnode.prev = newnode;
			head=newnode;
		}
		else
		{
			Node temp=head.prev;
			temp.next=newnode;
			newnode.prev=temp;
			newnode.next=head;
			head.prev=newnode;
		}	
	}
	
	
	public void addByValue(int val, int num)
	{
		Node newnode=new Node(val);
		Node temp=head;
		while(temp.next!=head && temp.data !=num)
		{
			temp=temp.next;
		}
		if(temp.data == num)
		{
			newnode.next=temp.next;
			newnode.prev=temp;
			//temp.next.prev=newnode;
			temp.next=newnode;	
		}
		 if(temp.next != head)
		 {
			 temp.next.prev=newnode;
			 //newnode.next=head;
		 }
		 else
		 {
			 System.out.println(num + "not found");
		 }
		
	}


	public void displayData()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			do
			{
				System.out.print(temp.data+"--->");
				temp=temp.next;
			}while(temp !=head);
		}
		System.out.println("Head");
	}

}

package com.LinkedList;

public class DoublyLinkedList {
	Node head;
	class Node{
		int data;
		Node prev,next;
		public Node(int data)
		{
			this.data=data;
			prev=null;
			next=null;
		}
	}

	public DoublyLinkedList()
	{
		head=null;
	}
	

	    public void addByValue(int val, int num) {
	        Node temp = head;
	        if (temp == null) {
	            System.out.println("not found.");
	            return;
	        }

	        while (temp != null && temp.data != val) {
	            temp = temp.next;
	        }

	      

	        Node newNode = new Node(num);
	        newNode.next = temp.next;
	        newNode.prev = temp;

	        if (temp.next != null) {
	            temp.next.prev = newNode;
	        }

	        temp.next = newNode;
	    }
	
	public void addByPosition(int pos,int val)
	{
		Node newnode=new Node(val);
		if(pos==1)
		{
			newnode.next=head;
			if(head != null)
				head.prev=newnode;
			head=newnode;
		}
		else
		{
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++)
			{
				temp=temp.next;
			}
			if(temp != null)
			{
				newnode.next=temp.next;
				newnode.prev=temp;
				temp.next=newnode;
				if(newnode.next !=null)
				{
					newnode.next.prev=newnode;
				}
			}
			else
			{
				System.out.println(pos +" is beyond the limit");
			}
		}
	}
	
	public void deleteByValue(int val)
	{
		Node temp=head;
		if(head.data==val)
		{
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}
		else
		{
			while(temp!=null && temp.data!=val )
			{
				temp=temp.next;
			}
			
			if(temp!=null)
			{
				
				temp.prev.next=temp.next;
				if(temp.next!=null)
				{
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				temp.prev=null;
			}
			else {
				
				System.out.println(val +" Not Found");
			}
		}
	}
	
	public void deleteByPos(int pos)
	{
		Node temp=head;
		if(pos==1)
		{
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}
		for(int i=0;temp!=null && i<pos-1;i++)
		{
			temp.prev.next=temp.next;
			temp.next.next=temp.prev;
			temp.next=null;
			temp.prev=null;
		}
		
	}
	public void display()
	{
		Node temp=head;
		while(temp != null)
		{
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}

package com.linkedlists;

public class CircularLinkedList {
	Node head;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public CircularLinkedList()
	{
		head=null;
	}
	
	public void addNode(int val)
	{
		Node newnode= new Node(val);
		if(head == null)
		{
			head=newnode;
		}
		else
		{
			Node temp =head;
			while(temp.next != head)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
		newnode.next=head;
	}

	public void displayData()
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			do
			{
				System.out.print(temp.data + "---->");
				temp=temp.next;
			}while(temp != head);
		}
		System.out.println("Head");
	}
	
	public void addByValue(int val,int num)
	{
		Node newnode=new Node(val);
		if(head.data==num)
		{
			newnode.next=head.next;
			head.next=newnode;
		}
		else
		{
			Node temp=head;
			do
			{
				temp=temp.next;
			}while(temp!=head && temp.data != num);
			if(temp != head)
			{
				newnode.next=temp.next;
				temp.next=newnode;
			}
			else
			{
				System.out.println(num+"Not found");
			}
		}
		
	}
	public void addByPosition(int pos,int val)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node newnode=new Node(val);
			if(pos==1)
			{
				Node temp=head;
				while(temp.next != null)
				{
					temp=temp.next;
				}
				
				newnode.next=head;
				head=newnode;
				temp.next=head;
			}
			else
			{
				Node temp=head;
				int i=1;
				for(;temp.next!=head && i<=pos-2;i++)
				{
					temp=temp.next;	
				}
				if(i>pos-2)
				{
					newnode.next=temp.next;
					temp.next=newnode;
				}
				else
				{
					System.out.println("pos beyond the limit");
				}
			}
		}
	}
	
	public void deleteByPosition(int pos)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			if(pos==1)
			{
				Node tail=head;
				while(tail.next !=head)
				{
					tail=tail.next;
				}
				if(tail == head)
				{
					head=null;
				}
				else
				{
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}
			else
			{
				Node prev=null;
				int i=0;
				for(;temp.next != head && i<pos-1;i++)
				{
					prev=temp;
					temp=temp.next;
				}
				if(i==pos-1)
				{
					prev.next=temp.next;
					temp.next=null;
				}
				else
				{
					System.out.println("Pos not found");
				}
			}
		}
	}
	
	public void deleteByValue(int val)
	{
		if(head==null)
		{
			System.out.println("List is empty");
		}
		else
		{
			Node temp=head;
			if(head.data==val)
			{
				Node tail=head;
				while(tail.next != head)
				{
					tail=tail.next;
				}
				if(tail==head)
				{
					head=null;
				}
				else
				{
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}
			else
			{
				Node prev=null;
				int i=0;
				for(;temp.next!=head && temp.data != val ;i++)
				{
					prev=temp;
					temp=temp.next;
				}
				if(temp.data ==val)
				{
					prev.next=temp.next;
					temp.next=null;
				}
				else
				{
					System.out.println("Pos not found");
				}
			}
		}
	}
	
	
}	
	

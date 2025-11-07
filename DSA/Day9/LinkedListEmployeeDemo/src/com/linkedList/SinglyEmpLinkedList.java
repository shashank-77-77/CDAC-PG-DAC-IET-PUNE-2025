package com.linkedList;

import com.beans.Employee;

public class SinglyEmpLinkedList {
	Node head;
	class Node
	{
		Employee data;
		Node next;
		
		public Node(Employee data)
		{
			this.data=data;
			this.next=null;
			
		}
	}
	public SinglyEmpLinkedList() {
		this.head = null;
	}
	
	public void addAfterNum(Employee ob ,int empnum)
	{
		Node newnode=new Node(ob);
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empnum)
		{
			temp=temp.next;
		}
		
		if(temp != null)
		{
			newnode.next=temp.next;
			temp.next=newnode;
		}
		else
		{
			System.out.println(empnum+"Not Found");
		}
	}
	
	public void addByPos(int pos,Employee ob)
	{
		Node newnode=new Node(ob);
		if(pos == 1)
		{
			newnode.next=head;
			head=newnode;
		}
		else
		{
			Node temp=head;
			for(int i=1;temp!=null && i<=pos-2;i++)
			{
				temp=temp.next;
			}
			if(temp!=null)
			{
				newnode.next=temp.next;
				temp.next=newnode;
			}
			else
			{
				System.out.println(pos+"Beyond the limit");
			}
		}
	}
	
	public void addNode(Employee ob)
	{
		Node newnode=new Node(ob);
		if(head ==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
			
		}
	}
	
	public void displayData()
	{
			if(head==null)
			{
				System.out.println("List is empty");
			}
			else
			{
				for(Node temp=head;temp!=null;temp=temp.next)
				{
					System.out.print(temp.data+"---->");
				}
				System.out.println("null");
			}
	}
	
	
	public void deleteByValue(int empno) {
		Node temp=head;
		
		if(head.data.getEmpno()==empno) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			while(temp!=null && temp.data.getEmpno()!=empno) {
				prev=temp;
				temp=temp.next;
			}
			//value found
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println(empno + " not found");
			}
		}
	}
	
	public void modifysalById(int empno,double newsal) {
		Node temp=head;
		while(temp!=null && temp.data.getEmpno()!=empno) {
			temp=temp.next;
		}
		if(temp!=null) {
			temp.data.setSal(newsal);
			System.out.println("salary updated");
		}else{
			System.out.println(empno + " not found");
		}
	}
	
	public void deleteByPosition(int pos) {
		Node temp=head;
		if(pos==1) {
			head=temp.next;
			temp.next=null;
		}else {
			Node prev=null;
			for(int i=0;temp!=null && i<pos-1;i++) {
				prev=temp;
				temp=temp.next;
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
			}else {
				System.out.println(pos+ " is beyond the limit");
			}
		}
	}
	

}

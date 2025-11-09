package com.demo.hashing;

public class MyHashTable {
	Node[] heads;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		};
		
	}
	public MyHashTable() {
		heads=new Node[10];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	public MyHashTable(int size) {
		heads=new Node[size];
		for(int i=0;i<heads.length;i++) {
			heads[i]=null;
		}
	}
	
	public void insertData(int val) {
		Node newNode=new Node(val);
		//apply hash function to find position
		int pos=val%heads.length;
		//add at the begining of the list
		if(heads[pos]!=null) {
			newNode.next=heads[pos];
		}	
		heads[pos]=newNode;
		
	}
	
	public void displayHashTable() {
		for(int i=0;i<heads.length;i++) {
			Node temp=heads[i];
			System.out.print(i+"--->");
			while(temp!=null) {
				System.out.print(temp.data+"----->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	public boolean searchData(int num) {
		int pos=num%heads.length;
		Node temp=heads[pos];
		while(temp!=null) {
			if(temp.data==num) {
				System.out.println(num + "found in  bucket "+pos);
				return true;
			}
			temp=temp.next;
			
		}
		System.out.println(num + " not found in  bucket "+pos);
		return false;
	}
	
	

}

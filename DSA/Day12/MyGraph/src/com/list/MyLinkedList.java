package com.list;

public class MyLinkedList {
       Node head;
       class Node
       {
    	   int data;
    	   Node next;
    	   
    	   public Node(int data)
    	   {
    		   super();
    		   this.data = data;
    		   
    		   this.next = null;
    	   }
       }
       
       
       public MyLinkedList()
       {
    	   head=null;
       }
       
       public void addNode(int num)
       {
    	   Node newNode=new Node(num);
    	   if(head !=null)
    	   {
    		   newNode.next=head;
    	   }
    	   head=newNode;
       }
       
       public boolean Search(int val)
       {
    	   if(head==null)
    	   {
    		   return false;
    	   }
    	   else
    	   {
    		   Node temp=head;
    		   while(temp != null && temp.data!=val)
    		   {
    			   temp=temp.next;
    		   }
    		   if(temp.data==val)
    		   {
    			   return true;
    		   }
    		   return false;
    	   }
       }
       
       public int [] addAdjescentNodes(int [] arr)
       {
    	   Node temp=head;
    	   for(int i =0;temp != null && i<arr.length;i++)
    	   {
    		   arr[i]=temp.data;
    		   temp=temp.next;
    	   }
    	   return arr;
       }
       
       public void displayList()
       {
    	   if(head == null)
    	   {
    		   System.out.println("List is empty");
    	   }
    	   else
    	   {
    		   Node temp=head;
    		   while(temp!=null)
    		   {
    			   System.out.println(temp.data +"----->");
    			   temp=temp.next;
    		   }
    		   System.out.print("null");
    		   System.out.println();
    		   
    	   }
       }
}

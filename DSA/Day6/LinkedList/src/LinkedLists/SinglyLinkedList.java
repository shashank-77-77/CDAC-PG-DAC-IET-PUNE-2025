package LinkedLists;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
				
	}
	public SinglyLinkedList() {
		head=null;
	}
	
	
	public void addByNum(int value,int num) {
		Node newNode=new Node(value);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
	
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		}else {
			System.out.println(num+"Not Found");
		}
	}

	public void addByPosition(int pos,int value) {
		Node newNode=new Node(value);
		if(pos==1) 
		{	
			newNode.next=head;
			head=newNode;
		}else {
				Node temp=head;
					for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println("Given position "+pos+"  is beyond the length of the list");
			}
		}
	}

	public void addNode(int value) {
		
		Node newNode=new Node(value);
	
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			for(Node temp=head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"-->");
			}
			System.out.println("null");
		}
	}
	

}

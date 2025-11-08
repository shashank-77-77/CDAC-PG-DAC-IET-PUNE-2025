package com.demo.stacks;

public class CircularQueue {
	int[] arr;
	int front;
	int rear;
	public CircularQueue() {
		arr=new int[10];
		front=-1;
		rear=-1;
	}
	
	public CircularQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	public boolean isEmpty() {
		if(front==-1) {
			System.out.println("Queue is empty");
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if(front==0 && rear==arr.length-1) {
			System.out.println("Queue is full");
			return true;
		}else if(front==rear+1) {
			System.out.println("Queue is full");
			return true;
		}
		return false;
	}
	
	public boolean enQueue(int num) {
		if(!isFull()) {
			if(front==-1) {
				front=0;
			}
			rear=(rear+1)%arr.length;
			arr[rear]=num;
			System.out.println("added successfully " +num);
			return true;
		}
		return false;
	}
	
	public int deQueue() {
		if(!isEmpty()) {
			int n=arr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}else {
				front=(front+1)%arr.length;
			}
			return n;
		}
		return -1;
	}
	
	
	

}

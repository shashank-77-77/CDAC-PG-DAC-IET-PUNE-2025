package com.demo.stacks;

public class MyStackArray {
    private int[] arr;
    
	private int top;
	public MyStackArray() {
		arr=new int[10];
		top=-1;
	}
	public MyStackArray(int size) {
		arr=new int[size];
		top=-1;
	}
	
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("pushed "+num);
		}else {
			System.out.println("stack is full");
		}
	}
	public int pop() {
		if(!isEmpty()) {
		int num=arr[top];
		top--;
		return num;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==arr.length-1;
	}
    
}

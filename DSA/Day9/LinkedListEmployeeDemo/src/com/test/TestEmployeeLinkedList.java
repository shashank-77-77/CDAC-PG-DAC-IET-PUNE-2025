package com.test;

import com.beans.Employee;
import com.linkedList.SinglyEmpLinkedList;

public class TestEmployeeLinkedList {

	public static void main(String[] args) {
		SinglyEmpLinkedList elist=new SinglyEmpLinkedList();
		  elist.addNode(new Employee(12, "Yuvraj", 99999.0));
	      elist.addNode(new Employee(13, "Akshay", 99999.0));
	      elist.addNode(new Employee(14, "Soham", 78787.0));
	      elist.addNode(new Employee(15, "Shivam", 87878.0));
	      elist.addNode(new Employee(16, "Tushar", 56789.0));
	      elist.displayData();
	      System.out.println("------------------------------------------------------");
	      elist.addAfterNum(new Employee(17, "Shashank", 45678.0), 14);
	      elist.displayData();
	      elist.deleteByValue(13);
	      elist.modifysalById(14,100000);
	      elist.displayData();
		

	}

}

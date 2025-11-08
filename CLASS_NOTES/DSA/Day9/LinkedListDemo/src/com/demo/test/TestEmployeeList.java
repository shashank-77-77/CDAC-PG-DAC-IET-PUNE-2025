package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlists.SinglyLinkedListEmployee;

public class TestEmployeeList {

	public static void main(String[] args) {
		SinglyLinkedListEmployee elist=new SinglyLinkedListEmployee();
		elist.addNode(new Employee(12,"Rajan",99999));
		elist.addNode(new Employee(13,"Revati",99999));
		elist.addNode(new Employee(14,"Ashu",78787));
		elist.addNode(new Employee(15,"Sangeeta",87878));
		elist.addNode(new Employee(16,"Medha",56789));
		elist.displayData();
		System.out.println("----------------------------");
		elist.addAfterNum(new Employee(17,"Shubhangi",45678),14);
		elist.displayData();
		System.out.println("----------------------------");
		elist.deleteByValue(16);
		elist.deleteByValue(12);
		elist.deleteByValue(17);
		elist.deleteByValue(20);
		elist.displayData();
		elist.modifysalById(15, 88888);
		elist.displayData();

	}

}

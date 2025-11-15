package com.test;

import com.beans.Employee;
import com.sorting.EmployeeBubbleSort;

public class TestEmployeeBubbleSort {

	public static void main(String[] args) {
		EmployeeBubbleSort b1 =new EmployeeBubbleSort();
		Employee [] arr=new Employee[20];
		arr[0] = new Employee(101, "Alice", 50000);
        arr[1] = new Employee(102, "Bob", 42000);
        arr[2] = new Employee(103, "Charlie", 60000);
        arr[3] = new Employee(104, "David", 39000);
        arr[4] = new Employee(105, "Eve", 45000);
        arr[5] = new Employee(106, "Frank", 52000);
        arr[6] = new Employee(107, "Grace", 47000);
        arr[7] = new Employee(108, "Hank", 61000);
        arr[8] = new Employee(109, "Ivy", 44000);
        arr[9] = new Employee(110, "Jack", 56000);
        arr[10] = new Employee(111, "Kate", 38000);
        arr[11] = new Employee(112, "Leo", 58000);
        arr[12] = new Employee(113, "Mona", 36000);
        arr[13] = new Employee(114, "Nate", 49000);
        arr[14] = new Employee(115, "Olivia", 53000);
        b1.EmpBubble(arr);
        
        
        
        
        
        

	}

}

package com.test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.beans.Employee;

public class TestSerialization {

	public static void main(String[] args) {
		List<Employee> lst=new ArrayList<>();
		lst.add(new Employee(11,"Soham","AI",56789));
		lst.add(new Employee(12,"Shashank","Manager",55444));
		lst.add(new Employee(23,"Yuvraj","asistant",6665));
		
		///write data from list to file
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("empdata1.txt"));){
			for(Employee e:lst) {
				//converts Object into stream of bytes-->serialization
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//read data from file and display on the screen
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("empdata1.txt"))){
			
			while(true) {
				Employee e=(Employee)ois.readObject();
				System.out.println(e);
			}
			
			
		} catch(EOFException e) {
			System.out.println("Reached to end of file....");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}

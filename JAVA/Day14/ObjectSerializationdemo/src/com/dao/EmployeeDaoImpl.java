package com.dao;

import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.beans.Employee;
import java.io.File;

public class EmployeeDaoImpl implements EmployeeDao{
	

		   static List<Employee> lst;
		   static {
			   lst=new ArrayList<>();
			   
		   }

	@Override
	public Object readFile(String fname) {
		File f = new File(fname);
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname));){
			   while(true) {
				   Employee e=(Employee)ois.readObject();
				   lst.add(e);
			   }
				
				
			} catch(EOFException e) {
				System.out.println("Reached to end of file");
				
				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("size: "+lst.size());
		
		return null;
	}

	@Override
	public boolean save(Employee e1) {
		
		return lst.add(e1);
	}

	@Override
	public boolean deletebyId(int empid) {
		return lst.remove(new Employee(empid));
		
	}

	@Override
	public boolean updateById(int id, double sal) {
		int pos=lst.indexOf(new Employee(id));
		if(pos!=-1) {
			lst.get(pos).setSal(sal);
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> getAllData() {
		
		return lst;
	}

	@Override
	public Employee getById(int id) {
		int pos=lst.indexOf(new Employee(id));
		if(pos != -1)
		{
			return lst.get(pos);
		}
		return null;
	}

	@Override
	public Object writeToFile(String fname) {
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fname)))
		{
			for(Employee e:lst)
			{
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
	

}

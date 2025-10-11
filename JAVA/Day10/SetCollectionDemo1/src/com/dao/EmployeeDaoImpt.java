package com.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Set;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

import com.beans.Employee;

public class EmployeeDaoImpt implements EmployeeDao {
    static Set<Employee> eset;
    static{
    	eset=new HashSet<>();
        eset.add(new Employee(105,"Soham",45000,LocalDate.of(2022,10,06)));
        eset.add(new Employee(106,"Shashank",43500,LocalDate.of(1999,11,07)));
        eset.add(new Employee(100,"Rohit",50000,LocalDate.of(2027,11,02)));
        eset.add(new Employee(101,"Yuvraj",55000,LocalDate.of(2025,10,12)));
        eset.add(new Employee(103,"Tushar",60000,LocalDate.of(2024,11,02)));
        eset.add(new Employee(104,"Shivam",65000,LocalDate.of(2020,11,12)));
    }
	@Override
	public boolean save(Employee e) {
		
		return eset.add(e);
	}
	@Override
	public Set<Employee> displayAll() {
		
		return eset;
	}
	@Override
	public Employee searchById(int id) {
		for(Employee e :eset)
		{
			if(e.getEpmid()==id)
			{
				return e;
			}
		}
		return null;
	}
	@Override
	public Set<Employee> searchByName(String nm) {
		Set <Employee> tempset=new HashSet();
		for(Employee e :eset)
		{
			if(e.getEname().equals(nm))
			{
				tempset.add(e);
			}
		}
		if(tempset.size()>0)
		{
			return tempset;
		}
		return null;
	}
	@Override
	public boolean updateSal(int id, double sal) {
		Employee e = searchById(id);
		if(e != null)
		{
			e.setSal(sal);
			return true;
		}
		return false;
	}
	@Override
	public boolean deleteById(int id) {
		
		return eset.remove(new Employee(id));
	}
	@Override
	public boolean deleteBySal(double sal) {
		return eset.removeIf(e->e.getSal()>sal);
	}
	@Override
	public Set<Employee> sortById() {
		Set<Employee> tset=new TreeSet<>();
		for(Employee e:eset) {
			tset.add(e);
		}
		return tset;
	}
	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal=(o1,o2)->{
			System.out.println("in sal Comparator "+o1.getSal()+"-------"+o2.getSal());
			return (int)(o1.getSal()-o2.getSal()); 
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
	}
	@Override
	public List<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in name comparator "+o1.getEname()+"-----"+o2.getEname());
			return o1.getEname().compareTo(o2.getEname());
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	

	
	

    

	

}

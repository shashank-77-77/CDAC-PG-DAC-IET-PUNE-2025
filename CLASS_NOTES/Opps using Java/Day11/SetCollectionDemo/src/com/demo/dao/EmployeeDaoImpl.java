package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
    static Set<Employee> eset;
    static{eset=new HashSet<>();
          eset.add(new Employee(105,"Amit",57565,LocalDate.of(2023,11,02)));
          eset.add(new Employee(106,"Ajay",56565,LocalDate.of(2023,11,02)));
          eset.add(new Employee(100,"Arti",56565,LocalDate.of(2024,02,02)));
         eset.add(new Employee(101,"Anita",46565,LocalDate.of(2024,02,02)));
         eset.add(new Employee(103,"Ajay",56565,LocalDate.of(2023,11,02)));
         eset.add(new Employee(104,"Ajay",56565,LocalDate.of(2023,11,02)));
    }
	@Override
	public boolean save(Employee e) {
		
		return eset.add(e);
	}
	@Override
	public Set<Employee> findAll() {
		
		return eset;
	}
	@Override
	public Employee findById(int id) {
//		for(Employee e : eset) {
//			if(e.getEmpid()==id) {
//				return e;
//			}
//		}
		
	Optional<Employee> ob= eset.stream().filter(e->e.getEmpid()==id).findFirst();
	 if(ob.isPresent()) {
		 return ob.get();
		 }
	return null;
	}
	@Override
	public Set<Employee> findByName(String nm) {
//	   Set<Employee> es = new HashSet<>();
//	   for(Employee e : eset) {
//		   if(e.getEname().equals(nm)) {
//			   es.add(e);
//		   }
//	   }
		Set<Employee> es = eset.stream().filter(e->e.getEname().equals(nm)).collect(Collectors.toSet());
	    
		if(es.size()>0) {
		   return es;
	   }
		return null;
	}
	@Override
	public boolean removeBySal(double sal) {
	// TODO Auto-generated method stub
		return eset.removeIf(e->e.getSal()>sal);
		
	}
	
	@Override
	public boolean removeById(int id) {
		return eset.remove(new Employee(id));
	}
	
	@Override
	public boolean updateBySal(int id, double sal) {
		// TODO Auto-generated method stub
		Employee e = findById(id);
		if(e != null) {
			e.setSal(sal);
			return true;
		}
		return false;
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
	public List<Employee> sortByName() {
		Comparator<Employee> c=(o1,o2)->{
			System.out.println("in name comparator "+o1.getEname()+"-----"+o2.getEname());
			return o1.getEname().compareTo(o2.getEname());
		};
		//duplicate names will not be considered
		//Set<Employee> tset=new TreeSet<>(c);
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(c);
		return elist;
	}
	@Override
	public List<Employee> sortBySal() {
		Comparator<Employee> csal=(o1,o2)->{
			System.out.println("in sal comparator "+o1.getSal()+"-----"+o2.getSal());
			return (int)(o1.getSal()-o2.getSal());
		};
		List<Employee> elist=new ArrayList<>();
		for(Employee e:eset) {
			elist.add(e);
		}
		elist.sort(csal);
		return elist;
		
	} 
    
    
    
}

package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.demo.dao.CourseDao;
import com.demo.dao.CourseDaoImpl;

public class CourseServiceImpl implements CourseService{
    private CourseDao cdao;

	public CourseServiceImpl() {
		super();
		this.cdao = new CourseDaoImpl();
	}

	@Override
	public boolean addNewCourse() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr course name");
		String cname=sc.next();
		System.out.println("enter capacity");
		int capacity=sc.nextInt();
		return cdao.save(cname,capacity);
		}

	@Override
	public Map<String, Integer> displayAll() {
		return cdao.findAll();
	}

	@Override
	public int searchByName(String cname) {
		return cdao.findByName(cname);
	}

	@Override
	public boolean modifyByName(String cname, Integer newcap) {
		return cdao.updateByName(cname,newcap);
		
	}

	@Override
	public Set<String> displayByCapacity(int capacity) {
		return cdao.findByCapacity(capacity);
	}

	@Override
	public boolean modifyCourseName(String oname, String nname) {
		return cdao.updateCourseName(oname,nname);
	}

	@Override
	public boolean deleteByName(String cname) {
		return cdao.removeByName(cname);
	}

	@Override
	public boolean deleteByCapacity(int capacity) {
		return cdao.removeByCapacity(capacity);
	}

	@Override
	public Map<String, Integer> sortByName() {
		return cdao.sortByName();
	}

	@Override
	public Set<Entry<String, Integer>> sortByCapacity() {
		return cdao.sorByCapacity();
	}
    
}

package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseService {

	boolean addNewCourse();

	Map<String, Integer> displayAll();

	int searchByName(String cname);

	boolean modifyByName(String cname, Integer newcap);

	Set<String> displayByCapacity(int capacity);

	boolean modifyCourseName(String oname, String nname);

	boolean deleteByName(String cname);

	boolean deleteByCapacity(int capacity);

	Map<String, Integer> sortByName();

	Set<Entry<String, Integer>> sortByCapacity();

}

package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseDao {

	boolean save(String cname, int capacity);

	Map<String, Integer> findAll();

	int findByName(String cname);

	boolean updateByName(String cname, Integer newcap);

	Set<String> findByCapacity(int capacity);

	boolean updateCourseName(String oname, String nname);

	boolean removeByName(String cname);

	boolean removeByCapacity(int capacity);

	Map<String, Integer> sortByName();

	Set<Entry<String, Integer>> sorByCapacity();

}

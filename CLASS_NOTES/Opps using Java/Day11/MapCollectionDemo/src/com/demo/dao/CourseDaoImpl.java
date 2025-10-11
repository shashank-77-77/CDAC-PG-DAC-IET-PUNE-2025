package com.demo.dao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CourseDaoImpl implements CourseDao{
	static Map<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("DAC", 240);
		hm.put("DBDA",65);
		hm.put("DTISS",60);
		}
	@Override
	public boolean save(String cname, int capacity) {
		if(hm.containsKey(cname))
			return false;
		hm.put(cname, capacity);
		return true;
	}
	@Override
	public Map<String, Integer> findAll() {
		return hm;
	}
	@Override
	public int findByName(String cname) {
		if(hm.containsKey(cname))
		     return hm.get(cname);
		else
			return -1;
	}
	@Override
	public boolean updateByName(String cname, Integer newcap) {
		if(hm.containsKey(cname)) {
		   hm.put(cname, newcap);
		   return true;
		}
		return false;
	}
	@Override
	public Set<String> findByCapacity(int capacity) {
		Set<String> keys=hm.keySet();
		Set<String> cnames=new HashSet();
		for(String s:keys) {
			//if capacity is greater the add in the set
			if(hm.get(s)>capacity) {
				cnames.add(s);
			}
		}
		if(cnames.size()>0) {
			return cnames;
		}
		return null;
	}
	@Override
	public boolean updateCourseName(String oname, String nname) {
		if(hm.containsKey(oname)) {
			int c=hm.remove(oname);
			hm.put(nname, c);
			return true;
		}
		return false;
	}
	@Override
	public boolean removeByName(String cname) {
		Integer val=hm.remove(cname);
		return val!=null;
	}
	@Override
	public boolean removeByCapacity(int capacity) {
		int cnt=0;
		Set<String> keys=hm.keySet();
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String s=it.next();
			if(hm.get(s)==capacity) {
				it.remove();
				cnt++;
			}
		}
		
		return cnt>0;
	}
	@Override
	public Map<String, Integer> sortByName() {
		Map<String,Integer> tmap=new TreeMap<>();
		Set<String> keys=hm.keySet();
		for(String s:keys) {
			tmap.put(s,hm.get(s));
		}
		return tmap;
		
	}
	@Override
	public Set<Entry<String, Integer>> sorByCapacity() {
		Set<Map.Entry<String, Integer>> es=hm.entrySet();
		//comparator to sort on values
		Comparator<Map.Entry<String, Integer>> c=(o1,o2)->{
			return o1.getValue()-o2.getValue();
		};
		Set<Map.Entry<String, Integer>> tset=new TreeSet<>(c);
		//copy data into TreeSet
		for(Map.Entry<String, Integer> e:es) {
			tset.add(e);
		}
		return tset;
		
	}
	
	
	
	

}

package com.demo.dao;

import java.util.Set;

import com.demo.beans.Project;

public interface ProjectDao {

	void save(Project p);

	Set<Project> findByPid(String[] parr);

	Project findById(int pid);

}

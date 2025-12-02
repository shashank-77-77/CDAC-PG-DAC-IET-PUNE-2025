package com.dao;

import java.util.Set;

import com.beans.Project;

public interface ProjectDao {

	void save(Project p);

	Set<Project> findByPid(String[] parr);

}

package com.demo.CategoryRestWebService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.CategoryRestWebService.beans.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category,Integer> {

}

package com.demo.CategoryRestWebService.service;

import java.util.List;

import com.demo.CategoryRestWebService.beans.Category;
import com.demo.CategoryRestWebService.dto.CategoryDto;

public interface CategoryService {

	Category getById(int cid);

	CategoryDto getProdCatById(int cid);

}

package com.wanderson.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wanderson.course.repositories.CategoryRepository;
import com.wanderson.course.entities.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> category = categoryRepository.findById(id);
		return category.get();
	}

}

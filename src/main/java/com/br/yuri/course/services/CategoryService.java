package com.br.yuri.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.yuri.course.entities.Category;
import com.br.yuri.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return this.repository.findAll();
	}
	
	
	public Category findById(Long id) {
		Optional<Category> obj = this.repository.findById(id);
		
		return obj.get();
	}

}

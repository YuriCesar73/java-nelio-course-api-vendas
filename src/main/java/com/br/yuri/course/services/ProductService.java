package com.br.yuri.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.yuri.course.entities.Product;
import com.br.yuri.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return this.repository.findAll();
	}
	
	
	public Product findById(Long id) {
		Optional<Product> obj = this.repository.findById(id);
		
		return obj.get();
	}

}

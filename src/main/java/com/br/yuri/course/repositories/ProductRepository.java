package com.br.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yuri.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}

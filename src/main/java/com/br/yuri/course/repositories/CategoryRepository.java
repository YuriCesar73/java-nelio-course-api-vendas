package com.br.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yuri.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}

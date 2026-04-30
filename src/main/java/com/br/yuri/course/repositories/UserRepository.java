package com.br.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yuri.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}

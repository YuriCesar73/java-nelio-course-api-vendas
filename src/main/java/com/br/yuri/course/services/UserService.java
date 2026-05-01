package com.br.yuri.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.yuri.course.entities.User;
import com.br.yuri.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return this.repository.findAll();
	}
	
	
	public User findById(Long id) {
		Optional<User> obj = this.repository.findById(id);
		
		return obj.get();
	}

}

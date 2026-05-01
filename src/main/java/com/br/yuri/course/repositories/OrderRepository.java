package com.br.yuri.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.yuri.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}

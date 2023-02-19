package com.estudojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

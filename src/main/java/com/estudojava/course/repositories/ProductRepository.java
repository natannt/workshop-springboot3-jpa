package com.estudojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

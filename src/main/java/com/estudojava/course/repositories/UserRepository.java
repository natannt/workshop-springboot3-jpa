package com.estudojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

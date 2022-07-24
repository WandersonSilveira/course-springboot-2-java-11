package com.wanderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

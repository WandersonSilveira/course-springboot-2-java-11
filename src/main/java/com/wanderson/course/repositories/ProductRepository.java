package com.wanderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

package com.wanderson.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wanderson.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

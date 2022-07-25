package com.wanderson.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wanderson.course.entities.Order;
import com.wanderson.course.entities.User;
import com.wanderson.course.entities.enums.OrderStatus;
import com.wanderson.course.repositories.OrderRepository;
import com.wanderson.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		User user1 = new User(1L, "Maria", "maria@gmail.com", "1111-1111", "12345");
		User user2 = new User(2L, "Joao", "joao@gmail.com", "2222-2222", "67890");
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
		Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);
		
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));

	}
}

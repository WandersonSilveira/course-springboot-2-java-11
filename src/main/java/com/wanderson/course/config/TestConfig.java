package com.wanderson.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.wanderson.course.entities.User;
import com.wanderson.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User(1L, "Maria", "maria@gmail.com", "1111-1111", "12345");
		User user2 = new User(2L, "Joao", "joao@gmail.com", "2222-2222", "67890");
		
		userRepository.saveAll(Arrays.asList(user1, user2));

	}
}

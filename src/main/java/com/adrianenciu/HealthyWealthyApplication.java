package com.adrianenciu;

import com.adrianenciu.model.User;
import com.adrianenciu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthyWealthyApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(HealthyWealthyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		userRepository.save(new User("Alice", "Arama"));
		userRepository.save(new User("Adrian", "Enciu"));
	}
}

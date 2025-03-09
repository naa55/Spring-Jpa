package com.example.demo;

import com.example.demo.models.Author;
import com.example.demo.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthorRepository repository
	) {
		return args -> {
//			var author = Author.builder()
//					.name("John Doe") // Example field
//					.age(45)          // Example field
//					.build();         // <-- This is required
//
//			repository.save(author);
		};
	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAppApplication.class, args);
	}

	@GetMapping(path="/hello")
	public String greet() {
		return "Welcome to my portal";
	}
}

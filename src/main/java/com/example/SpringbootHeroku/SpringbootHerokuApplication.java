package com.example.SpringbootHeroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHerokuApplication.class, args);
	}

}

@RestController
class HelloController {

	@GetMapping("/")
	String hello() {
		return "This tutorial is the best. All hail the great Kristijan.";
	}
}
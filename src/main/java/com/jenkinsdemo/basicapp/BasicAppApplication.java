package com.jenkinsdemo.basicapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BasicAppApplication {

	@GetMapping("/")
	String index(){
		return "Hello Jenkins V3. Welcome to the world of CI/CD [Introductory app]";
	}

	public static void main(String[] args) {
		SpringApplication.run(BasicAppApplication.class, args);
	}

}

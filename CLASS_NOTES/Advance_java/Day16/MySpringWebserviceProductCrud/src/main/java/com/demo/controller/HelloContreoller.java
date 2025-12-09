package com.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContreoller {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!";
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> sayWelcome() {
		return ResponseEntity.ok("Welcome to RestWebservice");
	}

}

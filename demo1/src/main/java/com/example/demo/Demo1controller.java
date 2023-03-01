package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Demo1controller 
{
	
	@GetMapping("/welcome")
    public String hello() {
    	
    	return "Welcome to Spring Boot";
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	private String StudentName="Asmithaa S";
    @GetMapping ("/")
	public String welcome() {
		return "Hi! "+StudentName;
	}
    
}
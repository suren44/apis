package com.example.testapi.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@RequestMapping("/")
	public String testAPI () {
		return "Hello World Test API!";
	}
}

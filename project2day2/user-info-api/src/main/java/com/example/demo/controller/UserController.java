package com.example.demo.controller;
import com.example.demo.model.User;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser() {
		return new User(1, "Vishvarajsinh", "vaghelavishvarajsinh010@gmail.com");
	}
}

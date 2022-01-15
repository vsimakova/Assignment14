package com.coderscampus.Assignment14.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.Assignment14.dto.User;
import com.coderscampus.Assignment14.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User createUser (@RequestBody String name) {
		return userService.createUser(name);
	}
}
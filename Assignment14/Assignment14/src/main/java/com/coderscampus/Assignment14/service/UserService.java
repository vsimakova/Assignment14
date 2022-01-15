package com.coderscampus.Assignment14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.Assignment14.dto.User;
import com.coderscampus.Assignment14.repository.UserRepository;



@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User createUser (String name) {
		User user = new User();
		user.setName(name);
		return userRepo.save(user);
	}
}
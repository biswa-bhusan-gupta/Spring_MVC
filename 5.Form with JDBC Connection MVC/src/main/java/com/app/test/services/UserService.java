package com.app.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.test.entities.User;
import com.app.test.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	public Integer saveUser(User user) {
		User obj=repo.save(user);
		return obj.getId();
	}
}

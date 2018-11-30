package com.spring.mvc.repository;

import org.springframework.stereotype.Repository;

import com.spring.mvc.model.User;

@Repository
public class UserRepository {

	public boolean findUser(String username, String password) {
		User user = user();
		return user.getUsername().equalsIgnoreCase(username) && user.getPassword().equalsIgnoreCase(password);
	}

	private User user() {
		return new User("dilip", "dilip");
	}

}

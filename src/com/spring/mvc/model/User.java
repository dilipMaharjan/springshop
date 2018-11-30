package com.spring.mvc.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class User {
	@NotEmpty(message = "is required")
	@Size(max = 6, min = 3)
	private String username;
	@NotEmpty(message = "is required")
	@NotEmpty(message = "is required")
	private String password;

	public User() {
	}

	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

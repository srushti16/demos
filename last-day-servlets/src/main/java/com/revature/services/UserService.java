package com.revature.services;

import com.revature.beans.User;

public class UserService {
	
	public User login(String username, String password) {
		if(username.equals("blake") && password.equals("pass")) {
			return new User(1, "blake", "pass");
		}
		return null;
	}
}

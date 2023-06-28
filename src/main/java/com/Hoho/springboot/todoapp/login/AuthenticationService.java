package com.Hoho.springboot.todoapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

	public boolean authentication(String username,String password) {
		boolean isValidUserName = username.equalsIgnoreCase("Ho");
		boolean isValidPassword = password.equalsIgnoreCase("123123");
		return isValidUserName && isValidPassword;
	}
	
}

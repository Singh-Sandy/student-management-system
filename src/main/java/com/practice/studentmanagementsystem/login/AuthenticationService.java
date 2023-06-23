package com.practice.studentmanagementsystem.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("sandy");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidUserName && isValidPassword;
	}
}

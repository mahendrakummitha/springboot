package com.example.WebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authenticate(String Username, String Password) {
		boolean isValidUser = Username.equalsIgnoreCase("mahendra");
		boolean isValidPassword = Password.equalsIgnoreCase("kkr0224");
		return isValidUser && isValidPassword;
	} 

}

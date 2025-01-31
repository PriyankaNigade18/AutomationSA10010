package com.PojoTest;

public class AuthenticatePojo 
{
/*
 * POJO: plain old java object
 * Encapsulation: private data+ public method(getters and setters)
  {
    "username" : "admin",
    "password" : "password123"
}
 */
	
	private String username;
	private String password;
	
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

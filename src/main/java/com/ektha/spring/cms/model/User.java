package com.ektha.spring.cms.model;

public class User {
	
	private String username;
	private String password;
	private String authority;
	
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
	public String getRole() {
		return authority;
	}
	public void setRole(String role) {
		this.authority = role;
	}

}

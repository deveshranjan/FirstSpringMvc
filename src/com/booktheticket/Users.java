package com.booktheticket;

import javax.validation.constraints.Size;

public class Users {
@Size(min=6,max=15,message="Username must be between 5 and 20 characters")
private String username;
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
@Size(min=6,max=15,message="Username must be between 5 and 20 characters")
private String password;
}

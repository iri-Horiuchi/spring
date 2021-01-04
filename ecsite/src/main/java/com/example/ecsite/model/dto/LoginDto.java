package com.example.ecsite.model.dto;

import com.example.ecsite.model.entity.User;

public class LoginDto {

	private long id;
	private String userName;
	private String password;
	private String fullName;
	
	public LoginDto() {}
	
	public LoginDto(User user) {
		this.id = user.getId();
		this.userName = user.getUserName();
		this.password = user.getPassword();
		this.fullName = user.getFullName();
	}
	
	public LoginDto(long id,String userName,String password,String fullName) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPasswrod(String password) {
		this.password = password;
	}
	
	public String getFullname() {
		return fullName;
	}
	
	public void setFullname(String fullName) {
		this.fullName = fullName;
	}
}


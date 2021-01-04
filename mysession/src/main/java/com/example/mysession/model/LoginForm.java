package com.example.mysession.model;

import java.io.Serializable;

public class LoginForm implements Serializable{
	
	/**
	 * 		LoginSession クラス名にカーソルを当てる！
	 *				 クイックフィックス候補「Add generated serial version ID」を選択
	 */
	private static final long serialVersionUID = 3176122926867237877L;

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
}

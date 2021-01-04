package com.example.mysession.model;

import java.io.Serializable;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session",proxyMode=ScopedProxyMode.TARGET_CLASS)
public class LoginSession implements Serializable{
	//	private static final long serialVersionUID = ******************L;
	/**
	 * 		↑　の入力の仕方
	 * 			LoginSession クラス名にカーソルを当てる！
	 *				 クイックフィックス候補「Add generated serial version ID」を選択
	 *		↓　に自動入力される
	 */
	private static final long serialVersionUID = 823480084100149144L;

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

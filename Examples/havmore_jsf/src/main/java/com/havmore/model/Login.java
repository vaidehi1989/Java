package com.havmore.model;

import java.io.Serializable;

public class Login implements Serializable {

	private String userName;

	private String password;

	public Login() {
		// TODO Auto-generated constructor stub
	}

	public Login(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
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

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userName + "   " + this.password;
	}

}

package com.havmore.model;

import java.io.Serializable;

public class User implements Serializable {

	private String name;
	private String userName;
	private String password;
	private String type;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String userName, String password, String type) {
		super();
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public boolean equals(Object obj) {
		User user = (User) obj;
		return user.userName.equals(this.userName) && user.password.equals(this.password);
	}

}

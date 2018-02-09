package com.ambition.behavioral.observe.login;

import java.util.EventObject;

public class LoginEvent extends EventObject{
	
	private String name;
	private String password;

	public LoginEvent(Object source,String name, String password) {
		super(source);
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

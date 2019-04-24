package com.automation.selenium.cucumber.data;

import com.automation.selenium.cucumber.core.FormData;

public class LoginFormData extends FormData {
	
	private String username;
	private String password;
	
	public LoginFormData() {
		username = "tomsmith ";
		password = "SuperSecretPassword!";
	}

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

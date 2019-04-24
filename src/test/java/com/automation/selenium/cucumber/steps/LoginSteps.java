package com.automation.selenium.cucumber.steps;

import com.automation.selenium.cucumber.core.StepBase;
import com.automation.selenium.cucumber.data.LoginFormData;
import com.automation.selenium.cucumber.pages.PracticeLoginPage;

import cucumber.api.java.en.When;

public class LoginSteps extends StepBase {
	
	@When("I attempt to login as user {string} and password {string}")
	public void loginError(String username, String password) {
		getData().setUsername(username);
		getData().setPassword(password);
		
		PracticeLoginPage page = new PracticeLoginPage(getDriver());
		page.loginWithFailure(getData());
	}
	
	@When("I login as a valid user")
	public void loginSuccess() {
		PracticeLoginPage page = new PracticeLoginPage(getDriver());
		page.loginSuccessfully(getData());
	}

	private LoginFormData getData() {
		return getData(LoginFormData.class);
		
	}
}

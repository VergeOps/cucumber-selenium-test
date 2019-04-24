package com.automation.selenium.cucumber.steps.then;

import com.automation.selenium.cucumber.core.ThenBase;
import com.automation.selenium.cucumber.pages.AccountPage;
import com.automation.selenium.cucumber.pages.PracticeLoginPage;

import cucumber.api.java.en.Then;

public class LoginThenSteps extends ThenBase {	
	
	@Then("I see the error message {string}")
	public void validateLoginError(String error) {
		PracticeLoginPage page = new PracticeLoginPage(getDriver());
		assertContains(page.getErrorMessage(), error, "Error messages should be equal");
	}
	
	@Then("I am able to view my account page") 
	public void validateSuccessfulLogin() {
		AccountPage page = new AccountPage(getDriver());
		assertContains(page.getSuccessMessage(), "You logged into a secure area!", "Error messages should contain the expected text");
	}
}

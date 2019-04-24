package com.automation.selenium.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.selenium.cucumber.core.BasePage;
import com.automation.selenium.cucumber.data.LoginFormData;

public class PracticeLoginPage extends BasePage {
	
	@FindBy(id="username")
	private WebElement inputUsername;
	
	@FindBy(id="password")
	private WebElement inputPassword;
	
	@FindBy(css="button[type='submit']")
	private WebElement btnSubmit;
	
	@FindBy(id="flash")
	private WebElement txtErrorMessage;


	public AccountPage loginSuccessfully(LoginFormData data) {
		login(data);
		return new AccountPage(getDriver());
	}
	
	public PracticeLoginPage loginWithFailure(LoginFormData data) {
		login(data);
		return new PracticeLoginPage(getDriver());
	}
	
	private void login(LoginFormData data) {
		populateTextField(inputUsername, data.getUsername());
		populateTextField(inputPassword, data.getPassword());
		click(btnSubmit);
	}
	
	public String getErrorMessage() {
		return txtErrorMessage.getText();
	}

	
	public PracticeLoginPage(WebDriver driver) {
		super(driver);
	}

	public void loginWithValidCredentials() {
		// TODO Auto-generated method stub
		
	}

}

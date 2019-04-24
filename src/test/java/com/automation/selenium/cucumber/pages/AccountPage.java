package com.automation.selenium.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.selenium.cucumber.core.BasePage;


public class AccountPage extends BasePage {
	
	@FindBy(id="flash")
	private WebElement txtSuccessMessage;

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	public String getSuccessMessage() {
		return txtSuccessMessage.getText();
	}


}

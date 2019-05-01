package com.automation.selenium.cucumber.steps;

import com.automation.selenium.cucumber.core.StepBase;
import com.automation.selenium.cucumber.pages.practice.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomeSteps extends StepBase {
		
	@Given("I am on the home page")
	public void navigateToHomePage() {
		getDriver().navigate().to("http://automationpractice.com/index.php");
		
	}
	
	@When("I search for {string}")
	public void searchForItem(String item) {
		HomePage page = new HomePage(getDriver());
		page.searchForItem(item);
	}
}

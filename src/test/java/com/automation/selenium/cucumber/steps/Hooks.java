package com.automation.selenium.cucumber.steps;

import com.automation.selenium.cucumber.core.StepBase;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends StepBase {
	
	@Before
	public void beforeScenario(Scenario scenario) {
		initializeWebDriver(scenario);
		getDriver().navigate().to("https://the-internet.herokuapp.com/login");
	}
	
	@After
	public void afterScenario(Scenario scenario) {
		killWebDriver(scenario);
	}

}

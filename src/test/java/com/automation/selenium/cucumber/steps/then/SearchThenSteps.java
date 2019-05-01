package com.automation.selenium.cucumber.steps.then;

import com.automation.selenium.cucumber.core.ThenBase;
import com.automation.selenium.cucumber.pages.practice.product.SearchPage;

import cucumber.api.java.en.Then;

public class SearchThenSteps extends ThenBase {

	@Then("I see that {int} results have been found")
	public void validateLoginError(int numItems) {
		SearchPage page = new SearchPage(getDriver());
		
		String expectedResult = numItems + " results have been found.";
		
		assertEquals(page.getNumberOfResultsText(), expectedResult, "Proper number of items should show in banner");
		
	}
}

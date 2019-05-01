package com.automation.selenium.cucumber.pages.practice.product;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends ProductPage {
	
	@FindBy(xpath = "//a[@title='Add to cart']")
	private List<WebElement> listBtnAddToCart;
	
	@FindBy(css="p.alert-warning")
	private WebElement txtNoResultsForTerm;
	
	@FindBy(css="span.heading-counter")
	private WebElement txtNumberOfResults;

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean itemsDisplay() {
		
		return listBtnAddToCart.size() > 0;
	}
	
	public String getNoResultsBannerText() {
		return getText(txtNoResultsForTerm);
	}
	
	public String getNumberOfResultsText() {
		return getText(txtNumberOfResults);
	}

}

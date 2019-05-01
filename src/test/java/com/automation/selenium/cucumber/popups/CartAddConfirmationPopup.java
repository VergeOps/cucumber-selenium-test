package com.automation.selenium.cucumber.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.selenium.cucumber.core.BasePage;
import com.automation.selenium.cucumber.pages.practice.cart.CartPage;

public class CartAddConfirmationPopup extends BasePage {
	
	@FindBy(css="span[title='Continue shopping']")
	private WebElement btnContinueShopping;
	
	@FindBy(css="a[title='Proceed to checkout']")
	private WebElement btnProceedToCheckout;


	public CartAddConfirmationPopup(WebDriver driver) {
		super(driver);
	}
	
	public void continueShopping() {
		click(btnContinueShopping);
		
		waitForNotVisible(btnContinueShopping);
	}
	
	public CartPage proceedToCheckout() {
		click(btnProceedToCheckout);
		
		return new CartPage(getDriver());
	}

}

package com.automation.selenium.cucumber.pages.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.selenium.cucumber.core.BasePage;
import com.automation.selenium.cucumber.pages.practice.product.DressesPage;
import com.automation.selenium.cucumber.pages.practice.product.SearchPage;
import com.automation.selenium.cucumber.pages.practice.product.WomensPage;


public class HomePage extends BasePage {
	
	@FindBy (linkText="Women")
	private WebElement lnkWomen;
	
	@FindBy (xpath="(//a[text()='Dresses'])[2]")
	private WebElement lnkDresses;
    
	@FindBy(id="search_query_top")
	private WebElement inputSearch;	
	
	@FindBy(name="submit_search")
	private WebElement btnSearch;
	
	/**
	* Constructs an instance of the page object
	* @param driver Active WebDriver
	*/
	public HomePage(WebDriver driver) {
		super(driver);
	}
  
  /**
   * Clicks the Women's page link on the HomePage
   * @return WomensPage
   */
  public WomensPage clickWomen() {
	  click(lnkWomen);
	  
	  return new WomensPage(getDriver());
  }
  
  /**
   * Clicks the Dresses page link on the HomePage
   * @return DressesPage
   */
  public DressesPage clickDresses() {
	  click(lnkDresses);
	  
	  return new DressesPage(getDriver());
  }
 

  public SearchPage searchForItem(String item) {
	  
	  populateTextField(inputSearch, item);
	  click(btnSearch);
	  
	  return new SearchPage(getDriver());
  }

}

package com.travelocity.Testing.TestAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends BasePage {
	private String baseURL = "https://www.travelocity.com/es/?langid=2058&tpid=80001&eapid=0";

	@FindBy(xpath = "//li[2]/a")
	private WebElement btnJoin;
	
	public Home(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public Home goToThePage() {
		driver.get(baseURL);
		return this;
	}

	public void regiterJoin() {
		waitVisibility(btnJoin);
		click(btnJoin);
		
	}
}

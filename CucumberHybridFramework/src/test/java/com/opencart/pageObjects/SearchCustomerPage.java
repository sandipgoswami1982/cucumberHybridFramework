package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage
{
	public WebDriver ldriver;

	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemailBox;
	
	@FindBy(xpath="//button[@id='button-filter']")
	WebElement btnFilter;
	
	public void sendEmail(String email)
	{
		txtemailBox.sendKeys(email);
	}
	
	public void clickOnFilter()
	{
		btnFilter.click();
	}
}

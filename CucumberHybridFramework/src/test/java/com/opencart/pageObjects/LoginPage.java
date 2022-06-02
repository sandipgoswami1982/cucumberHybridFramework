package com.opencart.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='input-username']")
	WebElement txtUsername;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
	WebElement btnLogin;

	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	WebElement lnkLogout;

	public void setUsername(String username)
	{
		txtUsername.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}

	public void clickOnLogin()
	{
		btnLogin.click();
	}

	public void clickOnLogout()
	{
		lnkLogout.click();
	}
}

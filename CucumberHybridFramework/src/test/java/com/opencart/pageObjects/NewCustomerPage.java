package com.opencart.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewCustomerPage
{
	public WebDriver ldriver;

	public NewCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-customer']/a[1]")
	WebElement lnkCustomerMenu;

	@FindBy(xpath = "(//a[contains(text(),'Customers')])[2]")
	WebElement lnkCustomer;

	@FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")
	WebElement btnAddCustomer;

	@FindBy(xpath = "//select[@id='input-customer-group']")
	WebElement drpCustomerGroup;

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtFirstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtLastname;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmpassword;

	@FindBy(xpath = "//select[@id='input-newsletter']")
	WebElement drpNewsletter;

	@FindBy(xpath = "//select[@id='input-status']")
	WebElement drpStatus;

	@FindBy(xpath = "//select[@id='input-safe']")
	WebElement drpSafe;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnsave;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/text()")
	WebElement txtconfirm;
	

	public String getTitle()
	{
		return ldriver.getTitle();
	}

	public void clickOnCustomerMenu()
	{

		lnkCustomerMenu.click();
	}

	public void clickOnCustomerSubMenu()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", lnkCustomer);
		// lnkCustomer.click();
	}

	public void clickOnAddCustomerButton()
	{
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", btnAddCustomer);
		// btnAddCustomer.click();
	}

	public void selectCustomerGroup()
	{
		Select drp1 = new Select(drpCustomerGroup);
		drp1.selectByVisibleText("Default");
	}

	public void setFirstname(String firstname)
	{
		txtFirstname.sendKeys(firstname);
	}

	public void setLastname(String lastname)
	{
		txtLastname.sendKeys(lastname);
	}

	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}

	public void setTelephone(String tNumber)
	{
		txtTelephone.sendKeys(tNumber);
	}

	public void setPassword(String password)
	{
		txtPassword.sendKeys(password);
	}

	public void setConfirmPassword(String cpassword)
	{
		txtConfirmpassword.sendKeys(cpassword);
	}

	public void selectNewsletter()
	{
		Select drp = new Select(drpNewsletter);
		drp.selectByValue("1");
	}

	public void selectStatus()
	{
		Select drp = new Select(drpStatus);
		drp.selectByValue("1");
	}

	public void selectSafe()
	{
		Select drp = new Select(drpSafe);
		drp.selectByValue("1");
	}

	public void clickOnSaveButton()
	{
		btnsave.click();
	}
	
	public String confirmAddCustomer()
	{
		return txtconfirm.getText();
	}
}

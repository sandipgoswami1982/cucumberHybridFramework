package com.opencart.stepDefinitions;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.opencart.pageObjects.LoginPage;
import com.opencart.pageObjects.NewCustomerPage;
import com.opencart.pageObjects.SearchCustomerPage;

public class Baseclass
{
	public WebDriver driver;
	public LoginPage lp;
	public NewCustomerPage nc;
	public SearchCustomerPage sc;
	public static Logger logger;
	public Properties prop;
	
	public static String randomString()
	{
		String generatedstring1=RandomStringUtils.randomAlphabetic(5);
		return generatedstring1;
		
	}
}

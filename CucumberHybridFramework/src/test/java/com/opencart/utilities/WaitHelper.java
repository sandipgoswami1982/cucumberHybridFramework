package com.opencart.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper
{
	public WebDriver driver;

	public WaitHelper(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void waitForElement(WebElement element,long timeout)
	{
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}

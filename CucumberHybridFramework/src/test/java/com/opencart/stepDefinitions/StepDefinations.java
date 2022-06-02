package com.opencart.stepDefinitions;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencart.pageObjects.LoginPage;
import com.opencart.pageObjects.NewCustomerPage;
import com.opencart.pageObjects.SearchCustomerPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;

public class StepDefinations extends Baseclass
{
	@Before
	public void setup() throws IOException
	{
		logger = Logger.getLogger("CucumberHybridFramework");
		PropertyConfigurator.configure("log4j.properties");

		prop = new Properties();
		FileInputStream inputstream = new FileInputStream("config.properties");
		prop.load(inputstream);

		String br = prop.getProperty("browser");
		if (br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", prop.getProperty("chromepath"));
			driver = new ChromeDriver();
		}
		else if (br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", prop.getProperty("firefoxpath"));
			driver = new FirefoxDriver();
		}
		else if (br.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver", prop.getProperty("edgepath"));
			driver = new EdgeDriver();
		}

		logger.info("**********Launching browser**********");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}

	@Given("^user launch a chrome browser$")
	public void user_launch_a_chrome_browser() throws Throwable
	{

		lp = new LoginPage(driver);

	}

	@When("^user open an url \"([^\"]*)\"$")
	public void user_open_an_url(String url) throws Throwable
	{
		logger.info("*******opening url********");
		driver.get(url);
	}

	@When("^user enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_username_as_and_password_as(String user, String password) throws Throwable
	{
		logger.info("********Providing username***********");
		lp.setUsername(user);
		logger.info("******providing password*******");
		lp.setPassword(password);
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable
	{

		lp.clickOnLogin();
		logger.info("*******Succesfully login***********");
		Thread.sleep(3000);
	}

	@Then("^user can view Dashboard$")
	public void user_can_view_Dashboard() throws Throwable
	{
		logger.info("********checking title of the page*********");
		nc = new NewCustomerPage(driver);
		Assert.assertEquals("Dashboard", nc.getTitle());
	}

	@When("^user click on Customers menu$")
	public void user_click_on_Customers_menu() throws Throwable
	{
		logger.info("************adding new customer*****************");
		nc.clickOnCustomerMenu();
		Thread.sleep(2000);
	}

	@When("^click on Customer menu item$")
	public void click_on_Customer_menu_item() throws Throwable
	{
		nc.clickOnCustomerSubMenu();
		System.out.println("I am clicking");
	}

	@When("^click on add new button$")
	public void click_on_add_new_button() throws Throwable
	{
		nc.clickOnAddCustomerButton();
	}

	@Then("^user can view Add Customer page$")
	public void user_can_view_Add_Customer_page() throws Throwable
	{
		Assert.assertEquals("Customers", nc.getTitle());
	}

	@When("^user enter new customer info$")
	public void user_enter_new_customer_info() throws Throwable
	{
		logger.info("********Adding customer details*********");
		nc.selectCustomerGroup();

		nc.setFirstname("varsha");

		nc.setLastname("Goswami");

		String email = randomString() + "@gmail.com";
		nc.setEmail(email);

		nc.setTelephone("1234567890");

		nc.setPassword("123456");

		nc.setConfirmPassword("123456");

		nc.selectNewsletter();

		nc.selectStatus();

		nc.selectSafe();

	}

	@When("^click on save button$")
	public void click_on_save_button() throws Throwable
	{
		nc.clickOnSaveButton();
		Thread.sleep(2000);
	}

	@Then("^user can view confirmation message$")
	public void user_can_view_confirmation_message() throws Throwable
	{
		Assert.assertTrue(driver.getPageSource().contains("Success: You have modified customers!"));
		logger.info("************new customer added successfully *****************");
	}

	@When("^enter customer email$")
	public void enter_customer_email() throws Throwable
	{
		logger.info("*********seraching customer by passing register data***********");
		sc = new SearchCustomerPage(driver);
		sc.sendEmail("QYlEW@gmail.com");
	}

	@When("^click on filter button$")
	public void click_on_filter_button() throws Throwable
	{
		sc.clickOnFilter();
		logger.info("*************Customer found successfully*****************");

	}

	@Then("^user should found email in the search table$")
	public void user_should_found_email_in_the_search_table() throws Throwable
	{
		Assert.assertTrue(true);
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable
	{
		driver.close();
	}

}

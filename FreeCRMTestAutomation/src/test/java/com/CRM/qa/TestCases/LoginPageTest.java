package com.CRM.qa.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.CRM.qa.Base.TestBase;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage Login;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	@BeforeTest
	public void setup()
	{
		;
        Intialization();
         Login=new LoginPage();
        
}
	@Test
	public void LoginPageTitleTest()
	{
		String title=Login.ValidateLoginTitle();
		Assert.assertEquals(title,"FREECRM");
		
	}
	@Test
	public void LoginTest()
	{
		 homePage=Login.LoginPage(prop.getProperty("email"),prop.getProperty("password"));
	}
	@AfterTest
	public void TearDownt()
	{
		//driver.quit();
	}
	
}

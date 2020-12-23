package com.CRM.qa.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.CRM.qa.Base.TestBase;
import com.CRM.qa.Pages.HomePage;
import com.CRM.qa.Pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage Login;
	HomePage homePage;
	//HomePage homePage();
	public HomePageTest()
	{
		super();
	}
@BeforeTest
public void setup()
{
	Intialization();
	 Login=new LoginPage();
	 homePage=LoginPage.Login(prop.getProperty("email"),prop.getProperty("password"));
			
}
@Test
public void VerifyHomePagetitle()
{
	String title=homePage.ValidateHomePageTitle();
}
@AfterTest
public void TearDown()
{
	driver.close();
}
}

package com.CRM.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;


public class LoginPage extends TestBase
{

	@FindBy(xpath="//class[contains(text(),'Log In')]")
	WebElement LogIn;
	@FindBy(name="email")
	WebElement email;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//class[contains(text(),'Login')]")
	WebElement Login;
	public LoginPage()
	{
		
	PageFactory.initElements(driver, this);
	
	}
	public String ValidateLoginTitle()
	{
	return driver.getTitle();		
}
	public  HomePage LoginPage(String em,String pwd)
	{	
		email.sendKeys("em");
		password.sendKeys("pwd");
		Login.click();
		return HomePage();
		
		
	}
	private  com.CRM.qa.Pages.HomePage HomePage() {
		// TODO Auto-generated method stub
		return null;
	}
	public static com.CRM.qa.Pages.HomePage Login(String property, String property2) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}



package com.CRM.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.qa.Base.TestBase;

public class HomePage extends TestBase 
{
	@FindBy(xpath="//class[contains(text(),'user-display')]")
			WebElement userdisplay;
	@FindBy(xpath="//class[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath="//class[contains(text(),'Calendar')]")
	WebElement calendar;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
public String ValidateHomePageTitle()
{
	return driver.getTitle();
}
public ContactsPage clickoncontacstLink()
{
	contactsLink.click();
	return new ContactsPage();
	
}
}

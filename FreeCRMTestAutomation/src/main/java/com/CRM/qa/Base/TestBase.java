package com.CRM.qa.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.poifs.property.Property;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CRM.qa.Util.TestUtil;


public class TestBase 
{
	
	
	public static  WebDriver driver;
	public static Properties prop;
	static String browser;
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream ip=new FileInputStream(("C:\\Users\\adoshetty\\selenium\\FreeCRMTestAutomation\\src\\main\\java\\com"
					+ "\\CRM\\qa\\Config\\Config.Property"));
         prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();

		}
	}
public static void Intialization()
{
	
	//String Browser = null;
	String browserName=prop.getProperty(browser);
	if(browserName.equals("chrome"));
	{
	System.setProperty("webdriver.chrome.driver", "C://Users//adoshetty//selenium//chromedriver");
	WebDriver driver=new ChromeDriver();
}

driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_Load_TiemOut, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Wait,TimeUnit.SECONDS);
driver.get(prop.getProperty("URL"));
}

}

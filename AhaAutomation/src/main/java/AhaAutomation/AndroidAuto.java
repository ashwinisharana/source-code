package AhaAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidAuto 
{
	static AppiumDriver driver;
	@BeforeTest
	public static void main(String[] args) throws Exception
	{
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "pixel");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//		desiredCapabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\adoshetty\\selenium\\app.apk");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.shaadi.android");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.shaadi.android.ui.bulk_interest.BulkInterestActivity");
		desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.shaadi.android.MYPERMISSION");
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		URL	url = new URL("http://127.0.0.1:4723/wd/hub");
		
  AppiumDriver driver = new AppiumDriver(url, desiredCapabilities);
		String sessionId = driver.getSessionId().toString();
	}
		@Test
		public void testSignupByGoogle()
		{
		
		driver.findElement(By.name("Sign Up with Google")).click();
		driver.findElement(By.name("Ashwini D")).click();
		driver.findElement(By.name("Login")).click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		@Test
		public void testMyShaadiScreen()
		{
			 new WebDriverWait(driver, 40).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shaadi.android:id/menu_skip")));
			driver.findElement(By.id("com.shaadi.android:id/menu_skip")).click();
			driver.findElement(By.name("My Shaadi")).click();
			driver.findElement(By.id("com.shaadi.android:id/llConnect")).click();
			driver.findElement(By.id("com.shaadi.android:id/btnDismiss")).click();
			driver.findElement(By.id("com.shaadi.android:id/llConnect")).click();
			driver.findElement(By.id("com.shaadi.android:id/btnDismiss")).click();
			
		}
	
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}



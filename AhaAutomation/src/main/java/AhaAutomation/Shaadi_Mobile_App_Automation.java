package AhaAutomation;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Shaadi_Mobile_App_Automation {

	public static final KeyEvent BACK = null;
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
		//Google account  is already configured in the device so we can select it
		driver.findElement(By.name("Ashwini D")).click();
		driver.findElement(By.name("Login")).click();  //If the profile is already exists then Tap to login to the app
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		
		@Test
		public void testHomeScreen()
		{
			new WebDriverWait(driver, 40).until(ExpectedConditions.presenceOfElementLocated(By.id("com.shaadi.android:id/menu_skip")));
			driver.findElement(By.id("com.shaadi.android:id/menu_skip")).click();  //to Skip adds
			driver.findElement(By.name("My Shaadi")).click();                              //Tap on my shaadi icon from the home screen
			driver.findElement(By.id("com.shaadi.android:id/llConnect")).click();   //from new matches tap on connect button
			driver.findElement(By.id("com.shaadi.android:id/btnDismiss")).click();  //to dismiss 
			driver.findElement(By.id("com.shaadi.android:id/llConnect")).click();    //from the primium matches tap on connect button.
			driver.findElement(By.id("com.shaadi.android:id/btnDismiss")).click();  //to dismiss dialog
			String title = driver.getTitle();
		    Assert.assertEquals(title, "My Shaadi");
			
		}
		@Test
		public void testLogout()
		{
			driver.findElement(By.name("Account Settings")).click();
			driver.findElement(By.name("Logout")).click();
		}
	
		@AfterTest
		public void tearDown()
		{
			driver.quit();
		}
	}





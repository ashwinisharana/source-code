package AhaAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Sign_up {
	//WebDriver driver;
	AppiumDriver<MobileElement> driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  try {
	SignUp();
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  
	}

	public static void SignUp() throws Exception {
		// TODO Auto-generated method stub
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("platformName","Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("deviceName", "android sdk");
		caps.setCapability("udid", "emulator-5554");
		
		caps.setCapability("automationName", "Uiautomator");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.shaadi.android");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.shaadi.android.ui.bulk_interest.BulkInterestActivity");
		caps.setCapability(AndroidMobileCapabilityType.ADB_EXEC_TIMEOUT, "50");
		//caps.setCapability("appActivity", "com.google.android.gms.auth.api.signin.internal.SignInHubActivity");
		
		URL	url = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver<MobileElement> driver=new AppiumDriver<MobileElement> (url,caps);
		String sessionId = driver.getSessionId().toString();
		System.out.println("Appication stared");
		
		//caps.setCapability("testdroid_testTimeout", 1200);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
//	    driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Don't have an account? Sign Up\"]")).click();
//		 //WebElement Signup_click=
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]\r\n" + 
//        		"")).sendKeys("Richa-A@t.com");
// 		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]\r\n" + 
//				"")).sendKeys("abc123");
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/"+ "android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/"+ "android.view.View/android.view.View/android.widget.EditText[3]")).
//		sendKeys("abc123");
//       driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"SIGN UP\"]")).click();
//		WebElement JoinProviderdropdown=driver.findElement(By.xpath("//android.view.View[@content-desc=\"Premium ASH Health\"]"));
//		WebElement Join=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"JOIN\"]"));
//		WebElement Email_Login=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
//		WebElement Password_Login=driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
//		WebElement Login=driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"LOGIN\"]"));
		
//		Signup_click.click();
//		Email.sendKeys("Rich4-A@t.com");
//		Password.
//		ConfirmPassword.
//		Signup.click();
//		JoinProviderdropdown.isSelected();
//		Join.click();
//		Email_Login.sendKeys("Rich4-A@t.com");
//		Password_Login.sendKeys("abc123");
//		Login.click();
//				
		
	}

}

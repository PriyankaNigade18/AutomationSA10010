package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class KeyEventClassDemo {
  @Test
  public void testVirtualKeyboard()
  {
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //area
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll down 2/3 times
	  MobileUtility.scrollDownUptoUserCount(driver,area,3);
	  
	  //textfields
	  driver.findElement(AppiumBy.accessibilityId("TextFields")).click();
	  
	  //area to type
	  WebElement editArea=driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit"));
	  //editArea.sendKeys("Hello All!");
	  
	  //Andoird keyboard automation
	 
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.H));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.L));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.O));
	  ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	  
	  
	

	  
	  
	  
	  
	  
	  
  }
}

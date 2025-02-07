package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.MobileUtility;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ScrollGesture {
  @Test
  public void testScroll()
  {
	  
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //get the locator for area
	  
	  WebElement area=driver.findElement(AppiumBy.id("android:id/list"));
	  
	  //scroll
	  /*
	  driver.executeScript("mobile: scrollGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","down",
			  "percent",1.0
			  ));
	  
	  System.out.println("Scroll gesture is completed!");
	  
	  */
	  
	  MobileUtility.scrollDownUptoUserCount(driver, area, 3);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

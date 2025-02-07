package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LongClickGesture {
  @Test
  public void testLongClickGesture()
  
  {
	  
	 //create a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  //first circle element
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  //long click gesture
	  driver.executeScript("mobile:longClickGesture",ImmutableMap.of(
			  
			  "elementId",((RemoteWebElement)ele).getId(),
			  "duration",4000
			  		  
			  ));
	  
	  System.out.println("Long Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

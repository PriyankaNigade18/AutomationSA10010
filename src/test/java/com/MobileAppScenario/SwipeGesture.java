package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class SwipeGesture {
  @Test
  public void testSwipeGesture()
  {
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  //Gallery
	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
	  
	  
	  
	  //photos
	  driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
	  
	  //get the area
	  WebElement area=driver.findElement(AppiumBy.id("io.appium.android.apis:id/gallery"));
	  
	  
	  //swipe
	  driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)area).getId(),
			  "direction","left",
			  "percent",1.0
			  
			  ));
	  
	  
	  
  }
}

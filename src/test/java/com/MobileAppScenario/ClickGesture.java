package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class ClickGesture {
  @Test
  public void testClickGesture() 
  {
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //Views element-click gesture action
	  
	  WebElement viewsEle=driver.findElement(AppiumBy.accessibilityId("Views"));
	  
	  //ele.click();
	  
	  //using clickGesture
	  driver.executeScript("mobile: clickGesture",ImmutableMap.of(
			  
			  "elementId", ((RemoteWebElement)viewsEle).getId()
			  
			  
			  ));
	  
	  
	  System.out.println("Click gesture is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class DragGesture {
  @Test
  public void testDragGesture() 
  
  {
	  
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  
	  //views
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  
	  
	  //drag and drop
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  
	  //first circle
	  WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
	  //perform action
	  
	  driver.executeScript("mobile:dragGesture",ImmutableMap.of(
			  "elementId",((RemoteWebElement)ele).getId(),
			  "endX",706,
			  "endY",1164
			  
			  ));
	  
	  String resultText=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
	  System.out.println(resultText);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

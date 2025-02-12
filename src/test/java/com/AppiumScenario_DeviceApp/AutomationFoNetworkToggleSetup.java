package com.AppiumScenario_DeviceApp;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AutomationFoNetworkToggleSetup {
  @Test
  public void testNetworkSetup() throws InterruptedException
  {
	  /*
	   * toggleWifi()
	   * toggleData()
	   * toggleAirplaneMode()
	   */
	  
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  
	  System.out.println("Initial status for wifi is ON");
	  //ON---->OFF
	  ((AndroidDriver)driver).toggleWifi();
	  System.out.println("After command status for wifi is Off");

	  Thread.sleep(2000);
	  //OFF to ON
	  ((AndroidDriver)driver).toggleWifi();
	  
	  //swipe left
	  WebElement area=driver.findElement(AppiumBy.id("com.android.systemui:id/tile_page"));
	  MobileUtility.swipeLeftGesture(driver,area);
	  
	  Thread.sleep(2000);
	  
	  //Mobile data
	  System.out.println("Initial status for mobile data is ON");
	  //on to off
	  ((AndroidDriver)driver).toggleData();
	  System.out.println("Current status for mobile data is OFF");

	  //off to on
	  ((AndroidDriver)driver).toggleData();
	  
	  //airplaneMode
	  System.out.println("Initial status for AirplaneMode is OFF");
	  //off to on
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  System.out.println("Current status for airplaneMode is ON");

	  //on to off
	  ((AndroidDriver)driver).toggleAirplaneMode();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

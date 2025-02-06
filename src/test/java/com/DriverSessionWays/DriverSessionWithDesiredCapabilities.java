package com.DriverSessionWays;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class DriverSessionWithDesiredCapabilities {
  @Test
  public void testFirstDriverSession() throws MalformedURLException
  {
	  //set capabilities for server
	  DesiredCapabilities cap=new DesiredCapabilities();
	  cap.setCapability("platformName","Android");
	  cap.setCapability("appium:automationName","uiautomator2");
	  cap.setCapability("appium:deviceName","pixel_5");
	  cap.setCapability("appium:udid","emulator-5554");
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  cap.setCapability("appium:app",path);
	  
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create a AppiumDriver session
	  AppiumDriver driver=new AndroidDriver(url,cap);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

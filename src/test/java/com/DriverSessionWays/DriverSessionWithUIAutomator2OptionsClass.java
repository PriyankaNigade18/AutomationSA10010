package com.DriverSessionWays;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverSessionWithUIAutomator2OptionsClass 
{
  @Test
  public void testDriverSession() throws MalformedURLException 
  {
	  //set capabilities
	  UiAutomator2Options option=new UiAutomator2Options();
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  option.setCapability("appium:app",path);
	  
	  //server address to connect
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create AppiumDriver Session
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("Session id is: "+driver.getSessionId());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

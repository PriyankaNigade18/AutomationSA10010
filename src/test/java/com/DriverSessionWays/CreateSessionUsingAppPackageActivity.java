package com.DriverSessionWays;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class CreateSessionUsingAppPackageActivity {
  @Test
  public void createNewSession() throws MalformedURLException
  {
	  UiAutomator2Options option=new UiAutomator2Options();
	  
	  option.setCapability("appium:appPackage","com.android.deskclock");
	  option.setCapability("appium:appActivity",".DeskClock");
	  
	  
	  //server adress
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("Session id: "+driver.getSessionId());
	  
	  
  }
}

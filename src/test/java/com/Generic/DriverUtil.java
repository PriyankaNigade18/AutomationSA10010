package com.Generic;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverUtil 
{
	
	public static AppiumDriver driver;
	
	public static AppiumDriver intiateDriverSession()
	{
		//set capabilities
		  UiAutomator2Options option=new UiAutomator2Options();
		  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
		  option.setCapability("appium:app",path);
		  
		  //server address to connect
		  try {
		  URL url=new URL("http://0.0.0.0:4723");
		  
		  //create AppiumDriver Session
		  driver=new AndroidDriver(url,option);
		  System.out.println("Session id is: "+driver.getSessionId());
		  }catch(MalformedURLException m)
		  {
			  System.out.println("Check server address");
		  }
		  
		  
		  return driver;
	}

}

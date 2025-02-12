package com.AppiumScenario_DeviceApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class RealDeviceTest {
  @Test
  public void testRealDevice() throws MalformedURLException
  {
	  UiAutomator2Options option=new UiAutomator2Options();
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  option.setCapability("appium:app",path);
	  
	  
	  //server address
	  URL url=new URL("http://0.0.0.0:4723");
	  
	  //create session
	  AppiumDriver driver=new AndroidDriver(url,option);
	  System.out.println("Session Id: "+driver.getSessionId());
	  
	  
	  
  }
}

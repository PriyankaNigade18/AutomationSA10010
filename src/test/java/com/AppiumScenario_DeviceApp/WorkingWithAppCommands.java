package com.AppiumScenario_DeviceApp;

import java.time.Duration;

import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class WorkingWithAppCommands {
  @Test
  public void testAppCommands() throws InterruptedException 
  {
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //package name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  System.out.println(" App Package Name is:"+packageName);
	  
	  //hpw to check current application status
	  System.out.println("Current status of application:"+((AndroidDriver)driver).queryAppState(packageName));
	  
	  //terminate app
	  
	  ((AndroidDriver)driver).terminateApp(packageName);
	  System.out.println("After terminate status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(1500);
	  
	  //activate App
	  
	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  Thread.sleep(1500);
	  
	  //uninstall app
	  ((AndroidDriver)driver).removeApp(packageName);
	  System.out.println("After uninstall status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //install app
	  String path=System.getProperty("user.dir")+"//src//test//resources//ApiDemos-debug.apk";
	  
	  ((AndroidDriver)driver).installApp(path);
	  System.out.println("After install status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  ((AndroidDriver)driver).activateApp(packageName);
	  System.out.println("After activate status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  
	  //background for 5 sec
	  ((AndroidDriver)driver).runAppInBackground(Duration.ofSeconds(5));
	  System.out.println("After Background status of application:"+((AndroidDriver)driver).queryAppState(packageName));

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

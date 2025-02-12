package com.AppiumScenario_DeviceApp;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class NotificationAutomation {
  @Test
  public void testNotification()
  {
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //open Notification
	  ((AndroidDriver)driver).openNotifications();
	  
	  //Number of notifications
	  List<WebElement> allNotifications=driver.findElements(AppiumBy.id("android:id/title"));
	  
	  System.out.println("Total number of Notifications are: "+allNotifications.size());
	 System.out.println("Text of Notifications: ");
	 
	  //parent text
	  for(WebElement i:allNotifications)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("Full notification message is: ");
	  String text1=driver.findElement(AppiumBy.id("android:id/big_text")).getText();
	  
	  System.out.println("Text1:"+text1);
	  
	  
	  String text2=driver.findElement(AppiumBy.id("android:id/text")).getText();
	  System.out.println("Text2:"+text2);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

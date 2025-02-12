package com.MobileAppScenario;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class AlertHandlingInAppium
{
	/*
	   * In Selenium Alert is interface
	   * 
	   * 3 types of alert
	   * ====================
	   * 1.simple alert(alert with Ok)
	   * 2.confirmation alert (ok/cancel)
	   * 3.prompt alert 
	   * 
	   * methods
	   * =========
	   * 1.accept()===>Ok
	   * 2.dismiss()===>cancel
	   * 3.prompt alert===>sendKeys()
	   * 4.to get the text of alert ==>getText()
	   * 
	   
	   * 
	   */
	  
  @Test
  public void testAlert() throws InterruptedException 
  {
	  //create a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //app
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	  
	  //alerts
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	  
	  //alert1
	  driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
	  
	  Thread.sleep(2000);
	  
	  //open alert window--->switch to alert
	 Alert alt1= driver.switchTo().alert();
	 System.out.println("Alert text is: "+alt1.getText());
	 alt1.accept();//Ok
	  
	  
	  
	  
	  
	  
  }
}

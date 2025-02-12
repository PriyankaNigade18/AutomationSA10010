package com.AppiumScenario_DeviceApp;

import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Lock_Unlock_RotateDeviceAutomation {
  @Test
  public void testLockUnlockRotate() throws InterruptedException 
    {
	 /*
	  * lockDevice()
	  * unlockDevice()
	  * rotate(ScreenOrientation)
	  */
	  
	  //create  a driver session
	  
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  //lock the device
	  ((AndroidDriver)driver).lockDevice();
	  
	  System.out.println("Device is locked....");
	  Thread.sleep(2000);
	  
	  ((AndroidDriver)driver).unlockDevice();
	  System.out.println("Device is unlocked....");
	  
	  //rotate
	  ((AndroidDriver)driver).rotate(ScreenOrientation.LANDSCAPE);

	  Thread.sleep(1500);
	  
	  ((AndroidDriver)driver).rotate(ScreenOrientation.PORTRAIT);

	  
	  
	  
	  
  }
}

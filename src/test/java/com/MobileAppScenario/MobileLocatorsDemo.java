package com.MobileAppScenario;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Generic.DriverUtil;
import com.Generic.MobileUtility;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class MobileLocatorsDemo {
  @Test
  public void testLocator() throws InterruptedException
  {
	 // create a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  MobileUtility.getScreenshot(driver,"FirstSession");
	 //Locator1: accessibilityId -->locate Access'ibility
	  WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
	  System.out.println("Text of ele1: "+ele1.getText());
	  ele1.click();
	  
	  MobileUtility.getScreenshot(driver,"Element1");
	  Thread.sleep(1500);
	
	  //navigate back
	   driver.navigate().back();
	   
	   //Locator2: android uiautomator-locate Animation
	   
	   WebElement ele2=driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Animation\")"));
	   System.out.println("Text of Ele2: "+ele2.getText());
	   ele2.click();
	   MobileUtility.getScreenshot(driver,"Element2");
	   Thread.sleep(1500);
		  
	//navigate back
	driver.navigate().back();
	
	//Locator3 xpath: locate App
	
	WebElement ele3=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"App\"]"));
	System.out.println("Text of Ele3: "+ele3.getText());
	ele3.click();
	  MobileUtility.getScreenshot(driver,"Element3");
	Thread.sleep(1500);
	  
	//navigate back
	driver.navigate().back();
	
	
	//Locator4: className
	WebElement ele4=driver.findElements(AppiumBy.className("android.widget.TextView")).get(5);
	System.out.println("Text of Ele4: "+ele4.getText() );
	ele4.click();
	  MobileUtility.getScreenshot(driver,"Element4");
	
	Thread.sleep(1500);
	  
	//navigate back
	driver.navigate().back();
	
	//Locator 5: resource-id or id---Locate Views
	
	WebElement ele5=driver.findElements(AppiumBy.id("android:id/text1")).get(11);
	System.out.println("Text of Ele5: "+ele5.getText());
	ele5.click();
	  MobileUtility.getScreenshot(driver,"Element5");
	Thread.sleep(1500);
	  
	//navigate back
	driver.navigate().back();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

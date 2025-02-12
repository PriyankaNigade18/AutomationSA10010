package com.AppiumScenario_DeviceApp;

import java.util.List;

import org.testng.annotations.Test;

import com.Generic.DriverUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class TestPerformanceParameters {
  @Test
  public void testPerformance()
  {
	  //create  a driver session
	  AppiumDriver driver=DriverUtil.intiateDriverSession();
	  
	  List<String> allParam=((AndroidDriver)driver).getSupportedPerformanceDataTypes();
	  System.out.println("All performance parameters: "+allParam);
	  
	  //[cpuinfo, memoryinfo, batteryinfo, networkinfo]
	  
	  //app package Name
	  String packageName=((AndroidDriver)driver).getCurrentPackage();
	  
	  //batteryinfo
	 List<List<Object>> batteryData=((AndroidDriver)driver).getPerformanceData(packageName,"batteryinfo",5);
	  System.out.println("Battery information: "+batteryData);
	  System.out.println("*******************************");
	  
	  List<List<Object>> memoryData=((AndroidDriver)driver).getPerformanceData(packageName,"memoryinfo",5);
	  System.out.println("Memroy information: "+memoryData);
	  
	  System.out.println("*******************************");
	  List<List<Object>> networkData=((AndroidDriver)driver).getPerformanceData(packageName,"networkinfo",5);
	  System.out.println("Network information: "+networkData);
	  System.out.println("*******************************");
	  List<List<Object>> cpuData=((AndroidDriver)driver).getPerformanceData(packageName,"cpuinfo",5);
	  System.out.println("CPU information: "+cpuData);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  
  
  }
}

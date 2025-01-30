package com.APITest;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstAPITest_NonBDD {
  @Test
  public void testSingleUserGetRequest()
  {
	  /*
	   * RestAssured is class and Response is interface
	   * 
	   */
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  System.out.println("Status code is:"+res.getStatusCode());
	  System.out.println("Status line is: "+res.getStatusLine());
	  System.out.println("Header contenttype: "+res.getHeader("Content-Type"));
	  System.out.println("Response time is: "+res.getTimeIn(TimeUnit.MILLISECONDS));
	  
	  System.out.println("Raw type response: "+res.asString());
	  
	  System.out.println("JSON response : "+res.asPrettyString());
	  
	  //validating status code
	  int actStatusCode=res.getStatusCode();
	  
	  Assert.assertEquals(actStatusCode,200,"Status code is not matched!");
	  System.out.println("Status code matched!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}

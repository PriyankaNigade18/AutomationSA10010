package com.APIScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.List;
/*
 * given(): prerequisite
 * --------------------------
 * Header,cookie,request payload,authentication,path and query param
 * 
 * when():API request
 * ------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * 
 * then():Validate Response
 * --------------------------
 * status code,message,response time,response payload
 */
public class Cookies_HeaderValidation {
  @Test
  public void testCookies() 
  {
	  Response res=given()
	  .when().get("https://www.google.com");
	  
	  //get all the cookies
	  res.then().log().cookies();
	  /*
	   * Cookies are always dynamic 
	   * cookies value should not be every time when you request
	   */
	  
	  String exp="YwuG0dci2JATUlwWvCiTrgXf";
	  
	  String act=res.getCookie("AEC");
	  Assert.assertFalse(act.contains(exp),"TestFail: cookies are same");
	  System.out.println("Test Pass: Cookies are different");
	  
	  
	  
  }
  
  @Test
  public void headerValidation()
  {
	  
	  Response res=given()
			  .when().get("https://www.google.com");
	  
	  //get the headers
	  res.then().log().headers();
	  
	  //Content-Type: text/html; charset=ISO-8859-1
	  
	  
	  //get the single header value
	  String header=res.getHeader("Content-Type");
	  
	  System.out.println("Value for Content-Type : "+header);
	  
	  Assert.assertEquals(header,"text/html; charset=ISO-8859-1");
	  
	  System.out.println("Test Pass: Headers are matched!");
	  
	  
	  
	  
  }
}

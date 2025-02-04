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

public class TestAuthenticationTypes {
  @Test
  public void testBasicAuth() 
  {
	  System.out.println("Basic Authentication validation");
	  /*
	   * Basic authentication--->Base 64
	   */
	  Response res=given()
			  		.auth().basic("postman","password")
			  	
			  	.when().get("https://postman-echo.com/basic-auth");
	  //get the log
	  res.then().log().body();
	  
	  boolean status=res.jsonPath().getBoolean("authenticated");
	 
	  Assert.assertEquals(status,true);
	  
	  
	  
  }
  
  @Test
  public void testDigestAuth()
  {
	  System.out.println("Validate Digest Authentication");
	  
	  /*
	   * Algorithm
	   * MD5|SHA
	   */
	  Response res=given()
			  .auth().digest("postman","password")
	  .when().get("https://postman-echo.com/digest-auth");
	  
	  res.then().log().body();
	  
	  
	  
	  
	  
  }
  
  
  @Test
  public void testBearerTokenAuth()
  {
	  System.out.println("validate Bearer token authentication");
	  
	  Response res=given()
			  .header("Authorization","Bearer SA10010")
			  .when().get("https://postman-echo.com");	
	  
	  res.then().log().body();
	  
		  
  }
  
  //@Test
  public void testBearerTokenAuthGitHub()
  {
	  System.out.println("validate Bearer token authentication");
	  
	  String token="githubToken";
	  Response res=given()
			  .header("Authorization","Bearer "+token)
			  .when().get("https://api.github.com/user/repos");	
	  
	  res.then().log().body();
	  
		  
  }
  
  
  
  
  
  
  
  
  @Test
  public void oAuth2Test()
  {
	  Response res=given()
			  .auth().oauth2("SA10010")
	  
			  .when().get("https://postman-echo.com");
	  //get the log
	  res.then().log().body();
	  
  }
  
  
  
  
  
  
  
  
  
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

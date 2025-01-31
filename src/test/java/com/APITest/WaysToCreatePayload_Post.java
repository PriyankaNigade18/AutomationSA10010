package com.APITest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoTest.AuthenticatePojo;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;


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
public class WaysToCreatePayload_Post {
  @Test
  public void basicPayload()
  {
	  //request payload
	  
	  
	  Response res=given()
	  .body("{\n"
	  		+ "    \"name\": \"Priyanka\",\n"
	  		+ "    \"job\": \"SDET\"\n"
	  		+ "}")
	  
	  .when().post("https://reqres.in/api/users");
	  
	  //validate status code
	  Assert.assertEquals(res.getStatusCode(),201);
	  System.out.println("Status code is matche!: "+res.getStatusLine());
	  
	  //validate json job=SDET
	  
//	  String jtest=res.jsonPath().getString("job");	
//	  Assert.assertEquals(jtest,"SDET");
//	  System.out.println("Job matched!");
	  
	  //log the response
	  res.then().log().body();
	  
	  
	  
  }
  
  @Test
  public void postUsingHashMap()
  {
	  //Request payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","SDET");
	  
	 Response res=given()
			 		.body(data)
	  
			 		.when().post("https://reqres.in/api/users");
	  
	  //validate json body
	 String profile=res.jsonPath().getString("job");
	 //Assert.assertEquals(profile,"SDET");
	 
	 //log the body
	 res.then().log().body();
	  
	  
	  
	  
	  
  }
  
  @Test
  public void testTokenUsingHashMap()
  {
	  //payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("username","admin");
	  data.put("password","password123");
	  
	  Response res=given()
			  		.header("Content-Type","application/json")
			  			.body(data)
	  
			  				.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  
	  //validate json =token
	  String tokenValue=res.jsonPath().getString("token");
	  System.out.println("Token is: "+tokenValue);
	  
	  
	  System.out.println("Status code: "+res.getStatusCode());
	  
	  
	  
  }
  
  @Test 
  public void postUsingPOJO()
  {
	  //request payload
	  AuthenticatePojo auth=new AuthenticatePojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	   
	  
	  Response res=given()
	   	.header("Content-Type","application/json")
	   	.body(auth)
	  
	   	.when().post("https://restful-booker.herokuapp.com/auth");
	  
	  
	  //json -token
	  String tokenId=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+tokenId);
	  
	  System.out.println("User name is: "+auth.getUsername());
  }
  
  
  
}

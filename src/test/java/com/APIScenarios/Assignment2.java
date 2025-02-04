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
public class Assignment2 {
  @Test
  public void f()
  {
  System.out.println("POST Request Using HashMap");
	  
  
  HashMap<String,Object> data=new HashMap<String,Object>();
  data.put("year", "2019");
  data.put("price", "1849.99");
  data.put("CPUmodel", "Intel Core i9");
  data.put("Harddisksize", "1 TB");
	  
  HashMap<String ,Object>map=new HashMap<String,Object>();
	  map.put("name","Apple MacBook Pro 16" );
	  map.put("data", data);
	  
	  
 
	  
Response res=given()
       .header("Content-Type","application/json")
	  .body(map)
	  .when().post("https://api.restful-api.dev/objects");

Assert.assertEquals(res.statusCode(),200,"status code does not match");
System.out.println("status code is match");
System.out.println( res.asPrettyString());

 res.then().log().body();

//get the log

  }
}

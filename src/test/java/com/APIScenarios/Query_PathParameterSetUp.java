package com.APIScenarios;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

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
public class Query_PathParameterSetUp {
  @Test
  public void f()
  {
	  //
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  
	  Response res=given()
	  .pathParam("path","objects")
	  .queryParam("id",3)
	  .queryParam("id",5)
	  .queryParam("id",10)
	  
	  .when().get("https://api.restful-api.dev/{path}");
	  
	  System.out.println("Status code: "+res.getStatusCode());
	  
	  
	  //log the response
	  res.then().log().body();
	  
  }
}

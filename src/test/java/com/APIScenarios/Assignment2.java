package com.APIScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoTest.Data;
import com.PojoTest.SingleObject;

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
	  
	  
 
	  
given()
       .header("Content-Type","application/json")
	  .body(map)
	  .when().post("https://api.restful-api.dev/objects")
	  
	  .then().body("data.CPUmodel",equalTo("Intel Core i9"));

//Assert.assertEquals(res.statusCode(),200,"status code does not match");
//System.out.println("status code is match");
//System.out.println( res.asPrettyString());
//
// res.then().log().body();
 
 	

  }
  
  @Test
  public void usingPojo()
  {
	  //payload
	  
	   Data data=new Data();
	   data.setYear(2019);
	   data.setPrice(1849.99);
	   data.setCpuModel("Intel Core i9");
	   data.setHardDiskSize("1 TB");
	   
	  SingleObject obj=new SingleObject();
	  obj.setName("Apple MacBook Pro 16");
	  obj.setData(data);
	  
	given()
      .header("Content-Type","application/json")
	  .body(obj)
	  .when().post("https://api.restful-api.dev/objects")
	  
//	  String act=res.jsonPath().getString("data.cpuModel");
//	  
//	  Assert.assertEquals(act, "Intel Core i9");
	  
	  .then().body("data.cpuModel",equalTo("Intel Core i9"))
	  .body("data.hardDiskSize",equalTo("1 TB"))
	  .log().body();
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

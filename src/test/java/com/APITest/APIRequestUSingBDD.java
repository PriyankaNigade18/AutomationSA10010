package com.APITest;

import org.testng.Assert;
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
public class APIRequestUSingBDD {
  @Test
  public void validateSingleUser_GET() 
  {
	  
	  given()
	  
	  .when().get("https://reqres.in/api/users/2")
	  
	  .then()
	  	.statusCode(200)
	  	.body("data.first_name",equalTo("Janet"))
	  	//log only headers
	  	//.log().headers();
	  	
	  	//log only json payload
	  	//.log().body();
	  
	  	//log all response 
	  	.log().all();
	  
	  
  }
  
  @Test
  public void validateSingleGET()
  {
	  
	  Response res=given()
	  
			  		.when().get("https://reqres.in/api/users/2");
	  
	  //validate status code
	  int statusCode=res.getStatusCode();
	  Assert.assertEquals(statusCode,200);
	  System.out.println("Status code matched: "+statusCode);
	  
	  //validation for json payload(body)
	 int id= res.jsonPath().getInt("data.id");
	 Assert.assertEquals(id,2);
	 System.out.println("id matched: "+id);
	 
	 //log the response
	 res.then().log().all();
	  
	  
  }
  
  
  @Test
  public void listOfUsersGET()
  {
	  
	  Response res=given()
	  
			  	.when().get("https://reqres.in/api/users?page=2");
	  
	  //validate status code
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched: "+res.getStatusCode());
	  
	  //json payload-  "first_name": "George"
	  String firstName=res.jsonPath().getString("data[4].first_name");
	  Assert.assertEquals(firstName,"George");
	  System.out.println("FirstName is expected!");
	  
	  //get all id's , compare to 6 and print inside console
	  
	  List<Integer> allId=res.jsonPath().getList("data.id");
	 	  
	  Assert.assertEquals(allId.size(),6);
	  System.out.println("Total id's are: "+allId.size());
	  
	  System.out.println("All Id's");
	  for(Integer i:allId)
	  {
		  System.out.println(i);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
}

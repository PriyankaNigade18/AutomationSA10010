package com.APITest;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class JsonValidationTest {
  @Test
  public void testSingleGetRequest() 
  {
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	 System.out.println(res.asPrettyString());
	  
	 //to validate json body-jsonPath() 
	 int id=res.jsonPath().getInt("data.id");
	 Assert.assertEquals(id,2,"id is not matched!");
	 System.out.println("Json path id is matched!");
	  
	  //validate firstName
	 String firstName=res.jsonPath().getString("data.first_name");
	  Assert.assertEquals(firstName,"Janet");
	  System.out.println("FirstName is matched!");
	  
	  //validate text form Support object
	  String text=res.jsonPath().getString("support.text");
	  Assert.assertTrue(text.contains("social media"));
	 System.out.println("Test Pass: "+text); 
	 
	  
	  
	  
  }
}

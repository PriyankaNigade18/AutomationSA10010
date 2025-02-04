package com.APIScenarios;

import org.testng.annotations.Test;

import com.PojoTest.AuthenticatePojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

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
public class Serialization_Deserialization 
{
	/*
	 * POJO----->JSON (Serialization)
	 * JSON---->POJO (de-serialization)
	 */
  @Test
  public void testSerialization() throws JsonProcessingException 
  {
	  AuthenticatePojo pojo=new AuthenticatePojo();
	  pojo.setUsername("admin");
	  pojo.setPassword("password123");
	  
	  
	  
	  ObjectMapper obj=new ObjectMapper();
	  String json=obj.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
	  
	  System.out.println(json);
	  
	  
	   
	  
  }
  
  
  @Test 
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String json="{\n"
	  		+ "  \"username\" : \"admin\",\n"
	  		+ "  \"password\" : \"password123\"\n"
	  		+ "}";
	  
	  
	  ObjectMapper obj=new ObjectMapper();
	  AuthenticatePojo pojo= obj.readValue(json,AuthenticatePojo.class);
	  
	  System.out.println(pojo.getUsername());
	  System.out.println(pojo.getPassword());
	  
	  
	  
	  
	  
  }
}

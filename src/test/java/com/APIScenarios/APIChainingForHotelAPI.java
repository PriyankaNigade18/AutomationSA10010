package com.APIScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoTest.AuthenticatePojo;
import com.PojoTest.BookingDetails;
import com.PojoTest.Dates;

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
public class APIChainingForHotelAPI 
{
	 int bookingId;
	 String tokenValue;
	 
  @Test(priority=1)
  public void createBooking()
  {
	  System.out.println("Testing Create booking API.....");
	  Dates date=new Dates();
	  date.setCheckin("2025-01-31");
	  date.setCheckout("2025-02-01");
	  
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Priyanka");
	  data.setLastname("Nigade");
	  data.setTotalprice(8987);
	  data.setDepositpaid(true);
	  data.setBookingdates(date);
	  data.setAdditionalneeds("lunch");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(data)
	  
	  .when().post("https://restful-booker.herokuapp.com/booking");
	  
	  //get the bookingid
	  bookingId=res.jsonPath().getInt("bookingid");
	  System.out.println("Booking craeted with booking id: "+bookingId);
	  
	  //get the log
	  
	  res.then().log().body();
	  
	   
  }
  
  
  @Test(priority=2)
  public void getBookingDetails()
  
  {
	  System.out.println("Get the booking details for id: "+bookingId);
	  
	 Response res= given()
	  
	  .when().get("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  //validate status code
	 Assert.assertEquals(res.getStatusCode(),200);
	 System.out.println("Status code matched: "+res.getStatusCode());
	  
	 //log the body
	 res.then().log().body();
	 
  }
  
  @Test(priority=3)
  public void createToken()
  {
	  System.out.println("Creating new Token for API call");
	  AuthenticatePojo auth=new AuthenticatePojo();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .body(auth)
	  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  
	  //get the token
	  tokenValue=res.jsonPath().getString("token");
	  System.out.println("Token generated: "+tokenValue);
	  
	  
	  
  }
  
  
  
  @Test(priority=4)
  public void fullBookingUpdate()
  {
	  System.out.println("Full Booking update using id: "+bookingId+" with token: "+tokenValue);
	  Dates date=new Dates();
	  date.setCheckin("2025-01-31");
	  date.setCheckout("2025-02-01");
	  
	  BookingDetails data=new BookingDetails();
	  data.setFirstname("Priya");
	  data.setLastname("Nigade-Konde");
	  data.setTotalprice(98877);
	  data.setDepositpaid(true);
	  data.setBookingdates(date);
	  data.setAdditionalneeds("dinner");
	  
	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Accept","application/json")
	  .header("Cookie","token="+tokenValue)
	  .body(data)
	  
	  .when().put("https://restful-booker.herokuapp.com/booking/"+bookingId);
	  
	  System.out.println("Status code is: "+res.getStatusCode());
	  
	  //log the response
	  res.then().log().body();
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

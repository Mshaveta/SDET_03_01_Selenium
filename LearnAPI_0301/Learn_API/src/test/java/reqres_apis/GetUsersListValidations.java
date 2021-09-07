package reqres_apis;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
 

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;



public class GetUsersListValidations {
	Response response;
	@Test 
	public void getUsersList() {
		RestAssured.baseURI="https://reqres.in/";
		 response = given().
			queryParam("page",2).
		when().
			get("api/users").
		then().
//			Way1:
//			assertThat().statusCode(200).and().
//			header("Content-Type","application/json; charset=utf-8").and().
//			body("page",equalTo(12)).
			extract().response();
		
		//String strResponse = response.asString();
		String strResponse = response.asPrettyString();
		
		System.out.println("Result - "+strResponse);
	}
	
	//way:2
	@Test
	public void verifyStatusCode() {
		int statusCode = response.getStatusCode();
		//Assert.assertEquals(statusCode, 200);
	}
	
	@Test
	public void verifyResponseTime() {
		long responseTime = response.getTime();
		System.out.println(responseTime);
		Assert.assertTrue(responseTime<3000);
		
	}
	
	
}

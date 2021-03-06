package reqres_apis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class GetUsersList {
	@Test 
	public void getUsersList() {
		RestAssured.baseURI="https://reqres.in/";
		
		Response response = given().
			queryParam("page",2).
		when().
			get("api/users").
		then().
			extract().response();
		
		//String strResponse = response.asString();
		String strResponse = response.asPrettyString();
		
		System.out.println("Result - "+strResponse);
	}
	
	@Test
	public void createUser(){
		RestAssured.baseURI="https://reqres.in/";
		
		Response response = given().
			body("{\r\n" + 
					"    \"name\": \"Tester\",\r\n" + 
					"    \"job\": \"QA\"\r\n" + 
					"}").
			headers("Content-Type",ContentType.JSON).
		when().
			post("api/users").
		then().
			extract().response();
		
		String resData = response.asPrettyString();
		System.out.println(resData);
		
	}
 
}

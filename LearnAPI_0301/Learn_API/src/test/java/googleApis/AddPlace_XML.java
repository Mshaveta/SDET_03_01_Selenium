package googleApis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
/*
 * given().
 * 	queryparam().
 * 	headers().
 * 	auth().
 * 	body().
 * when().
 * 	get/post/put/delete(resource)
 * then().
 * 	validations
 *  response
 */

public class AddPlace_XML {
	@Test
	public void addPlace() {
		RestAssured.baseURI="http://216.10.245.166";
		Response response = given().
			queryParam("key","qaclick123").
			body(UtilityClass.readXmlFile("addPlacePayload")).
		when().
			post("/maps/api/place/add/xml").
		then().
			extract().response();
		System.out.println(response.asPrettyString());
		 
	}
	
	@Test
	public void deletePlace() {
		RestAssured.baseURI="http://216.10.245.166";
		Response response = given().
			queryParam("key","qaclick123").
			body(UtilityClass.readXmlFile("deletePlaceXML")).
		when().
			post("/maps/api/place/delete/xml").
		then().
			extract().response();
		System.out.println(response.asPrettyString());
		 
	}
}

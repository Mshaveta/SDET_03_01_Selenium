package api_request_tests.googleApis;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static resources.googleAPis.GooglePlacesAPI_resource.*;

import static utility.CommonClassFuncs.*;
import static utility.ReadConfigProperties.*;

public class AddPlace_XML {
	@Test
	public void addPlace() {
		RestAssured.baseURI=readProperty("google-api-base-url");
		Response response = given().
			queryParam("key",readProperty("add_gglPlace_apiKey")).
			body(readXmlFile("addPlacePayload")).
		when().
			post(addGPlace_resource).
		then().
			extract().response();
		System.out.println(response.asPrettyString());
		 
	}
}

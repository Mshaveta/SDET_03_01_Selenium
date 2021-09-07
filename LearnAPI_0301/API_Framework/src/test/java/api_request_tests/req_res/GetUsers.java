package api_request_tests.req_res;

import static api_params.Reqres_params.USERS_LIST_PAGE;
import static io.restassured.RestAssured.given;
import static resources.reqres.ReqRes_resource.reqres_resource;
import static utility.ReadConfigProperties.readProperty;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetUsers {
	Response response ;
	@Test
	public void getUsers() {
		RestAssured.baseURI = readProperty("api-base-url");

		response = given().
								queryParam("page", USERS_LIST_PAGE).
							when().
								get(reqres_resource).
							then().
								extract().response();
	}
	
	
	@Test
	public void verifyStatusCode() {
		int act_statusCode = response.getStatusCode();
		Assert.assertEquals(act_statusCode, 200);
		
	}
}

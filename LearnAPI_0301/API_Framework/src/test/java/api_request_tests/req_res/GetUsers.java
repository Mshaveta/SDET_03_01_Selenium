package api_request_tests.req_res;

import static api_params.Reqres_params.USERS_LIST_PAGE;
import static io.restassured.RestAssured.given;
import static resources.reqres.ReqRes_resource.reqres_resource;
import static utility.ReadConfigProperties.readProperty;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utility.ApiCommonFuncs;

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
		
		//System.out.println(response.asPrettyString());
		//creating object of common AP funcs class
		ApiCommonFuncs obj =new ApiCommonFuncs(response);
		
		//count the objects
		int countObjs = obj.countTotalObjects();
		System.out.println("Total Objects-"+countObjs);
		
		//To get the value of Key
		int pageVal = (int) obj.getSingleKeyValue("page");
		System.out.println(pageVal);
		
		//to get Email id
		String  email = (String) obj.getSingleKeyValue("data[0].email");
		System.out.println(email);
	}
	
	
	@Test
	public void verifyStatusCode() {
		int act_statusCode = response.getStatusCode();
		Assert.assertEquals(act_statusCode, 200);
		
	}
}

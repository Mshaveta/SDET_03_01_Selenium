package reqres_apis;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class GetUsersList_getResponse {
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
		
		/*Get nodes of JSON Response*/
		JsonPath jp = new JsonPath(strResponse);
		Map map = jp.get("$");
		int count = map.size();
		System.out.println("Count - "+count);
		
		/*get single key value*/
		System.out.println("Total page - "+jp.get("total_pages"));
		
		/* get array of objects node*/
		System.out.println("Data:- "+jp.get("data"));
		
		List list = jp.get("data");
		int dataSize = list.size();
		System.out.println("Size- "+dataSize);
		
		System.out.println("Email - "+jp.get("data[0].email"));
		
		/*to get all the email ids*/
		
		for(int i=0;i<dataSize;i++) {
			System.out.println("Email - "+jp.get("data["+i+"].email"));
		}
		
	}
	
	
}

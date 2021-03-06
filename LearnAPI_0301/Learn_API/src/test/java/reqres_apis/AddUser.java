package reqres_apis;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoClasses.UserPOJO;

public class AddUser {
	@Test
	public void createUser(){
//		UserPOJO user = new UserPOJO();
//		RestAssured.baseURI="https://reqres.in/";
//		
//		user.setName("QA USER1");
//		user.setJob("QAM");
//		
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("name", user.getName());
//		map.put("job", user.getJob());
		
		
		Response response = given().
			body(UserPayload.addUserpayload()).
			headers("Content-Type",ContentType.JSON).
		when().
			post("api/users").
		then().
			extract().response();
		
		String resData = response.asPrettyString();
		System.out.println(resData);
		
	}
 
}

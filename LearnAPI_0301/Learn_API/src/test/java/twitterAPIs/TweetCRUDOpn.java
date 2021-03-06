package twitterAPIs;

import static io.restassured.RestAssured.given;
import static utility.UtilityClass.generateRandomStr;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class TweetCRUDOpn {
	String responseStr ;
	String tweet_id ;
	String deleResponse;
	
	@BeforeMethod
	public void getTweetUrl() {
		RestAssured.baseURI="https://api.twitter.com/";
	}
	
	@Test(priority=1)
	public void postTweet() {
		
		responseStr = given().
								auth().oauth("XLDlehUwaQj2psAlmW8FaHYuo", 
											 "VYQxywRbTNrFHuyoRHw0vBRanF6EqWk29n8fPMV1ZbqPApOFGo", 
											 "2249807023-vJR3aFCkf95boTd9ykCFFTA6Ocuczpuj4tqGg73", 
											 "YHlXFQVDZs9S7lhSx9h07pJA0ryPaVLUqn6SbYCK7qbNe").
								queryParam("status",generateRandomStr()).
							 when().
							 	post("1.1/statuses/update.json").
							 then().
							 	extract().response().asPrettyString();
		
		 
		
	}
	
	@Test(priority=2)
	public void getTweetId() {
		JsonPath jp = new JsonPath(responseStr);
		tweet_id = jp.get("id_str");
	}
	
	@Test(priority=3)
	public void deleteId() {
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		deleResponse = given().
						auth().oauth("XLDlehUwaQj2psAlmW8FaHYuo", 
							 "VYQxywRbTNrFHuyoRHw0vBRanF6EqWk29n8fPMV1ZbqPApOFGo", 
							 "2249807023-vJR3aFCkf95boTd9ykCFFTA6Ocuczpuj4tqGg73", 
							 "YHlXFQVDZs9S7lhSx9h07pJA0ryPaVLUqn6SbYCK7qbNe").
			 when().
			 	post("1.1/statuses/destroy/"+tweet_id+".json").
			 then().
			 	extract().response().asPrettyString(); 
		System.out.println(deleResponse);
	}
}

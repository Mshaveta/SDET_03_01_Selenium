package twitterAPIs;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static utility.UtilityClass.*;

public class AddTweet {
	@Test
	public void postTweet() {
		RestAssured.baseURI="https://api.twitter.com/";
		String responseStr = given().
								auth().oauth("XLDlehUwaQj2psAlmW8FaHYuo", 
											 "VYQxywRbTNrFHuyoRHw0vBRanF6EqWk29n8fPMV1ZbqPApOFGo", 
											 "2249807023-vJR3aFCkf95boTd9ykCFFTA6Ocuczpuj4tqGg73", 
											 "YHlXFQVDZs9S7lhSx9h07pJA0ryPaVLUqn6SbYCK7qbNe").
								queryParam("status",generateRandomStr()).
							 when().
							 	post("1.1/statuses/update.json").
							 then().
							 	extract().response().asPrettyString();
		System.out.println(responseStr);
	}
}

package twitterAPIs;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class GetHomeTweets {
	@Test
	public void getTweets() {
		RestAssured.baseURI="https://api.twitter.com/";
		String responseStr = given().
								auth().oauth("4JhW6N7E1s3q3XmZh0jWe2B9h", 
											 "gvdfrZSnrXEI2ZPpIINRGH4bhZMNjUWxGcDUOKqmQEUJA7DMVo", 
											 "2249807023-eaBHyDXwByw3ZK40p7dfWP6VdtakeZboGUcG0pb", 
											 "2JZiCHb9T2kRJ8dblafVA6kKwKQsWxzz6MGBRygmcbZdJ").
							 when().
							 	get("1.1/statuses/home_timeline.json").
							 then().
							 	extract().response().asPrettyString();
		System.out.println(responseStr);
	}
}

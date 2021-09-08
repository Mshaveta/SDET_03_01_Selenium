package utility;

import java.util.Map;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiCommonFuncs {
	private JsonPath jp;

	public ApiCommonFuncs(Response response) {
		String strResponse = response.asPrettyString();
		jp = new JsonPath(strResponse);
	}

	public int countTotalObjects() {
		Map mapObj = jp.get("$");
		int count = mapObj.size();
		return count;
	}

	// Method Loading
	public Object getSingleKeyValue(String keyName) {
		 Object keyValue = jp.get(keyName);
		return keyValue;
		
	}
}

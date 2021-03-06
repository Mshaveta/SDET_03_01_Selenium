package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.lang3.RandomStringUtils;

public class CommonClassFuncs {
	static byte[] xmlDataArr;
	static String xmlDataStr;

	public static String readXmlFile(String fileName) {
		String filePath = System.getProperty("user.dir") + "\\src\\main\\java\\playloads\\" + fileName + ".xml";
		Path path = Paths.get(filePath);
		try {
			xmlDataArr = Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}

		xmlDataStr = new String(xmlDataArr);
		return xmlDataStr;
	}

	public static String generateRandomData(String dataType, int count) {
		String data;
		switch (dataType) {
		case "numeric":
			data = RandomStringUtils.randomNumeric(count);
			break;
		case "aplhaNumeric":
			data = RandomStringUtils.randomAlphanumeric(count);
			break;
		default:
			data = RandomStringUtils.randomAlphabetic(count);
		}

		return data;

	}

	 
}

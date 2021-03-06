package googleApis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UtilityClass {
	static byte[] xmlDataArr;
	static String xmlDataStr;
	
	public static String readXmlFile(String fileName) {
		String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\googleApis\\"+fileName+".xml";
		Path path = Paths.get(filePath);
		try {
			xmlDataArr = Files.readAllBytes(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		xmlDataStr = new String(xmlDataArr);
		return xmlDataStr;
	}
}

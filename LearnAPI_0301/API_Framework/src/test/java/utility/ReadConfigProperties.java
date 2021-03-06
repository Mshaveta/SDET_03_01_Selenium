package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {
	static FileInputStream fis;
	static Properties prop;
	public static String readProperty(String propName) {
		//1. Get property File path
		String propFilePath = System.getProperty("user.dir")+"\\config\\config.properties";
		
		//Step2: 
		try {
			fis = new FileInputStream(propFilePath);
			prop =new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		//Step3: Read the property
		return prop.getProperty(propName);
		 
	}
 
}

package com.qa.hrm.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	private FileInputStream fis;
	public  Properties prop ;//null

	public ReadConfig() {

		// 1. get the .properties file path
		String propFilePath = System.getProperty("user.dir") + "\\config\\config.properties";
		// 2.
		try {
			fis = new FileInputStream(propFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//Creating object of 
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//	public String getConfigProp(String browserName) {
//		String browser_name = prop.getProperty(browserName);
//		return browser_name;
//	}
	
	public String getBrowser() {
		String browser_name = prop.getProperty("browser_name");
		return browser_name;
	}
	
	public  String getAppUrl() {
		String app_url = prop.getProperty("url");
		return app_url;
	}
	
	public String getAdminUname() {
		return prop.getProperty("admin_uname");
		
	}
	
	public  String getAdminPwd() {
		return prop.getProperty("admin_pwd");
		 
	}
	
 
}

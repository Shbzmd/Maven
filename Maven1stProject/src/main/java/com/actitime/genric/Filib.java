package com.actitime.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Filib {
	
	public String getPropertyData(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/main/resources/driver/Commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data= p.getProperty(key);
		return data;
		
		}

}

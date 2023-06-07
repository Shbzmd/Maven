package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.genric.BaseClass;

public class CreateCustomer{

	@Test
	public void TestCreateCustomer() {

		Reporter.log("TestCreateCustomer",true);
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.close();



	}

}

package com.actitime.genric;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass {

	static WebDriver driver;

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}

	@BeforeTest
	public void OpenBrowser() {

		Reporter.log("Open Browser",true);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterTest
	public void CloseBrowser() {

		Reporter.log("Close Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void Login() throws IOException {
		
		Reporter.log("Login",true);
		Filib f=new Filib();
		String url=f.getPropertyData("url");
		String un=f.getPropertyData("username");
		String pwd=f.getPropertyData("password");
		
		driver.get(url);
		
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pwd);
		
	}
}
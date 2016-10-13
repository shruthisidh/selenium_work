package com.org.shruthi.test.login;

//import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.org.shruthi.test.common.Util;

public class HomePageTitleVerification {
	
	static WebDriver driver;
	private static String baseUrl;
	
	public static void setUp() throws NullPointerException {
		
//	File pathToBinary = new File(Util.FIREFOX_PATH);
//	FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
	FirefoxProfile firefoxProfile = new FirefoxProfile();
	driver = new FirefoxDriver(firefoxProfile);
	baseUrl = Util.BASE_URL;
	driver.get(baseUrl + "/V4/");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String username,passward;
		String actualTitle;
//		String actualBoxTitle;
		
		setUp();
		
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys(Util.USER_ID);
		
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys(Util.PASS_WRD);
		
		driver.findElement(By.name("btnLogin")).click();
		
		actualTitle = driver.getTitle();
		if(actualTitle.contains(Util.EXPECTED_TITLE))
		{
			System.out.println("test is passes");
		}else{
			System.out.println("test is failed");		
		
		}
		driver.close();
	}

}

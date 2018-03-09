package com.CrossBrowsing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//testing the browsers
public class IndividualCrossBrowsingInXMl {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void getbrowsers(String browsername){
		if(browsername.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
//		else if(browsername.equalsIgnoreCase("chrom")){
//			System.setProperty("WebDriver.chrome.driver", "chromeDriver.exe path");
//			driver.new chromeDriver();
//		}else if(browsername.equalsIgnoreCase("ie")){
//			System.setProperty("WebDriver.ie.Driver","ie.exe path");
//			driver.new ieDriver();
//		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.get("http://www.demo.guru99.com/V4/index.php");
		System.out.println( driver.getTitle());
			
	}

}

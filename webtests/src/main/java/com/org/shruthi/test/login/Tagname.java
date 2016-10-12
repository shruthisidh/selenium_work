package com.org.shruthi.test.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String baseurl="http://www.demo.guru99.com/V4/index.php";
		String actualtagname = "";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		actualtagname = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[1]")).getTagName();
		System.out.println(actualtagname);
		driver.close();
		driver.quit();
		

	}

}

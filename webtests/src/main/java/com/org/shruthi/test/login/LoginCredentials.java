package com.org.shruthi.test.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String baseurl = "http://www.demo.guru99.com/V4/";
	String expectedtitle = "Guru99 Bank Manager HomePage";
	String actualtitle = "";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr50979");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("pAjEsEh");
		driver.findElement(By.xpath("html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		actualtitle = driver.getTitle();
		
		if(actualtitle.equalsIgnoreCase(expectedtitle)){
			System.out.println("true");
		}else{
			System.out.println("false");
			
		}
		
				

	}

}

package com.cps.sprint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyURL {
	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		}

	
	@Test
	public void verifyUrlTest() {
		driver.get("http://telugunations.com/banking/");
	String title=	driver.getTitle();
		Assert.assertEquals(title, "CPS BANK");
		}
@AfterTest
public void tearDown () {
	driver.quit();
	
}
	
	
	
}

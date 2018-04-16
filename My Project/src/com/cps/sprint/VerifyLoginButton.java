package com.cps.sprint;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginButton {
WebDriver driver;
	
	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		}

	@Test
	public void verifyLogInButton() throws Exception {
	driver.get("http://telugunations.com/banking/");
	String title=	driver.getTitle();
	//Thread.sleep(1000);
	Assert.assertEquals(title, "CPS BANK");   
WebElement loginbutton=	driver.findElement(By.xpath("//a[text()='Login']"));
	boolean status=		loginbutton.isDisplayed();
		System.out.println(status);
		loginbutton.click();
	String loginpage=	driver.getTitle();
Assert.assertEquals(loginpage, "Peace | Insurance Responsive Template");


		}
@AfterTest
public void tearDown () throws Exception {
	Thread.sleep(1000);
	driver.quit();
	
}
	
	
}

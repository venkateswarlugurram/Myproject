package com.cps.sprint;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChangePassword {

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
	public void verifyCustomerLogIn(String username,String Password) throws Exception {
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

WebElement userid=driver.findElement(By.xpath("//input[@id='userId']"));
	userid.clear();
	userid.sendKeys(username);
	
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.clear();
	password.sendKeys(Password);
	
	
WebElement submit=	driver.findElement(By.xpath("//button[@id='submit']"));
		System.out.println(submit.isDisplayed());
		submit.click();
		
	String title1=	driver.getTitle();	
		Assert.assertEquals(title1, "Peace | Insurance Responsive Template");
		
WebElement changepass=		driver.findElement(By.xpath("//a[text()='Change Password']"));
		changepass.click();

		String title2=	driver.getTitle();	
			Assert.assertEquals(title2, "Peace | Insurance Responsive Template");
	
			driver.findElement(By.xpath("//label[text()='Old Password']//following-sibling::input")).sendKeys("bank@customer");
			driver.findElement(By.xpath("//label[text()='Confirm Old Password']//following-sibling::input")).sendKeys("bank@customer");
			driver.findElement(By.xpath("//label[text()='New Password']//following-sibling::input")).sendKeys("bank@customer");
			driver.findElement(By.xpath("//button[text()='Submit ']")).submit();
			
		WebElement text=	driver.findElement(By.xpath("//div//h2[text()='ENTERED WRONG PASSWORD']"));
		String logtext=		text.getText();
			Assert.assertEquals(logtext, "ENTERED WRONG PASSWORD");
			
		}
@AfterTest
public void tearDown () throws Exception {
	Thread.sleep(1000);
	driver.quit();

}
}
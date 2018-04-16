package com.cps.sprint;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifySubBranch {


	WebDriver driver;

	@BeforeTest
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}

	
	@Test
	public void verifySubBranchTest() {
		driver.get("http://telugunations.com/banking/");
		String title=	driver.getTitle();
		Assert.assertEquals(title, "CPS BANK");
		Actions action=new Actions(driver);
WebElement dropdown=		driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));

	action.moveToElement(dropdown).build().perform();
	
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.equals("Sub Branch Login")) {
				list.get(i).click();
		String subtitle		=driver.getTitle();
				Assert.assertEquals(subtitle, "Peace | Insurance Responsive Template","your test case fail");
			}
	
		
		}
		
		}
	
	
	
@AfterTest
public void tearDown () {
	driver.quit();
	
}


	
	
}

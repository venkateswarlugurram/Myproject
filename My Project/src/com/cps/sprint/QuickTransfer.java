package com.cps.sprint;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class QuickTransfer {


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
	public void verifyQuickTransferlink() throws Exception {
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
	userid.sendKeys("customer1");
	
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.clear();
	password.sendKeys("bank@customer");
	
	
WebElement submit=	driver.findElement(By.xpath("//button[@id='submit']"));
		System.out.println(submit.isDisplayed());
		submit.click();
		
	String title1=	driver.getTitle();
		Assert.assertEquals(title1, "Peace | Insurance Responsive Template");
WebElement transfer=		driver.findElement(By.xpath("//a[text()='TRANSFER']"));
	Actions action= new Actions(driver);
	action.moveToElement(transfer).build().perform();
	List<WebElement> ele=driver.findElements(By.xpath("//ul[@class='dropdown-menu']"));
		System.out.println(ele.size());
		driver.findElement(By.xpath("//a[text()='QUICK TRANSFER']")).click();
		
		
		/*
		List<WebElement> radio = driver.findElements(By.xpath("//label[text()='FROM SAVING/CREDIT ::']//following-sibling::input"));
		System.out.println(radio.size());
		
		int i=0;
		while(i<radio.size()) {
			System.out.println(ele.get(i).getText());
			i++;
			
			
		}
		*/	/*if(ele.contains("QUICK TRANSFER")) {
				ele.get(i).click();
				
				
			}
			*/
			
		}
	
	
	
		}
/*@AfterTest
public void tearDown () throws Exception {
	Thread.sleep(1000);
	driver.quit();}
}
*/
	
	

package com.cps.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.CustomerLoginPage;
import com.cps.pages.LoginPage;

public class LoginPageTest extends Base {

	LoginPage cuslogin;
	CustomerLoginPage CusLoginPage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		CusLoginPage = new CustomerLoginPage();
		CusLoginPage.clickOnLoginLink();
		cuslogin = new LoginPage();
		cuslogin.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority=1)
	public void verifyCustomerLoginTest() throws Exception {
		
		Thread.sleep(5000);
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("affterlogintitle"), "title is not matched");
	}
	
	@Test(priority=2)
	public void clickOnCP() {
		cuslogin.clickOnCPlink();
	String title=	driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("CPTitle"), "title is not matched");
	}
	
	
	@Test(priority=3)
	public void verifyTransferLink() throws Exception {
		Thread.sleep(5000);
		cuslogin.clickOnTransferLink();
		cuslogin.getDropdownValues();
		
	}
	
	@Test(priority=4)
	public  void verifyOnQuiukTransferLink() {
		cuslogin.clickOnTransferLink();
		cuslogin.clickOnQuiukTransferlink();
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("QuiukTransferPageTitle"));
		
	}

	
	@Test(priority=5)
	public void verifyTransToAnotherBank() {
		cuslogin.clickOnTransferLink();
		cuslogin.clickOnTransferTOAnotherTransferlink();
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("TransferToOtherPageTitle"));
String text=		driver.findElement(By.xpath("//h1[text()='TRANSFER TO OTHER BANK']")).getText();
	Assert.assertEquals(text, prop.getProperty("TransferToOtherPageText"));
	}
	
	@Test(priority=6)
	public void verifyIMFSTransferLink() {
		cuslogin.clickOnTransferLink();
		cuslogin.clickOnIMFSTransferlink();
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("IMFSTransferPageTitle"));
String text=		driver.findElement(By.xpath("//h1[text()='MMID TRANSFER']")).getText();
	Assert.assertEquals(text, prop.getProperty("IMFSTransferPageText"));
		
		
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(4000);
		driver.quit();
	}

}

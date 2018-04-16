package com.cps.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.CustomerLoginPage;

public class CustomerLoginPageTest extends Base {
	CustomerLoginPage CusLoginPage;

	public CustomerLoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		CusLoginPage = new CustomerLoginPage();
	}

	
	
	
	
	@Test
	public void verifyLoginBtn() {

		CustomerLoginPage cuslog = CusLoginPage.clickOnLoginLink();
		String title = driver.findElement(By.xpath("//h2[text()='Account Log In']")).getText();
		Assert.assertEquals(title, prop.getProperty("loginpagetitle"), "Loginpage header not matched");
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}

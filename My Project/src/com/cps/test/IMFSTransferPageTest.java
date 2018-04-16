package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.CustomerLoginPage;
import com.cps.pages.IMFSTransferPage;
import com.cps.pages.LoginPage;

public class IMFSTransferPageTest extends Base {

	CustomerLoginPage CusLoginPage;
	LoginPage cuslogin;
	IMFSTransferPage imfs;
	public IMFSTransferPageTest() {
		
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		intialization();
		CusLoginPage = new CustomerLoginPage();
		CusLoginPage.clickOnLoginLink();
		cuslogin = new LoginPage();
		cuslogin.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cuslogin.clickOnTransferLink();
		imfs=new IMFSTransferPage();
		cuslogin.clickOnIMFSTransferlink();
	}

	@Test
	public void verifyIMFSTransaction() {
		
		imfs.makeImFSTransaction(prop.getProperty("AcNum"), prop.getProperty("ifsc"),
				prop.getProperty("money"));
		Assert.assertEquals(driver.getTitle(), prop.getProperty("IMFSTransferPageTitle"));
		
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.CustomerLoginPage;
import com.cps.pages.LoginPage;
import com.cps.pages.QuickTransferPage;

public class QuickTransferTest extends Base {
	CustomerLoginPage CusLoginPage;
	LoginPage cuslogin;
	QuickTransferPage QuickTrans;

	public QuickTransferTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		CusLoginPage = new CustomerLoginPage();
		CusLoginPage.clickOnLoginLink();
		cuslogin = new LoginPage();
		QuickTrans = new QuickTransferPage();
		cuslogin.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cuslogin.clickOnTransferLink();
		cuslogin.clickOnQuiukTransferlink();

	}

	@Test
	public void transerTest() throws Exception {
		
		QuickTrans.quickTransferTransAction(prop.getProperty("AcNum"), prop.getProperty("ifsc"),
				prop.getProperty("money"));

		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("QuiukTransferPageTitle"));
	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}

package com.cps.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.CustomerLoginPage;
import com.cps.pages.LoginPage;
import com.cps.pages.QuickTransferPage;
import com.cps.pages.TransferTOAnotherPage;

public class TransferToAnotherBankTest extends Base {

	CustomerLoginPage CusLoginPage;
	LoginPage cuslogin;
	QuickTransferPage QuickTrans;
	TransferTOAnotherPage TransAB;

	public TransferToAnotherBankTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		intialization();
		CusLoginPage = new CustomerLoginPage();
		CusLoginPage.clickOnLoginLink();
		cuslogin = new LoginPage();
		QuickTrans = new QuickTransferPage();
		TransAB = new TransferTOAnotherPage();
		cuslogin.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cuslogin.clickOnTransferLink();

	}

	@Test
	public void transerTest() throws Exception {
		cuslogin.clickOnTransferTOAnotherTransferlink();
		String title = driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("TransferToOtherPageTitle"));
		TransAB.makeTransToAnotherBank(prop.getProperty("AcNum"), prop.getProperty("ifsc"), prop.getProperty("money"),
				prop.getProperty("BankName"), prop.getProperty("comment"));

	}

	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.quit();
	}

}

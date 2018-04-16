package com.cps.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.ChangePasswordPage;
import com.cps.pages.CustomerLoginPage;
import com.cps.pages.LoginPage;

public class ChangePasswordPageTest extends Base {

	LoginPage cuslogin;
	CustomerLoginPage CusLoginPage;
	ChangePasswordPage cpchange;

	public ChangePasswordPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		CusLoginPage = new CustomerLoginPage();
		cuslogin = new LoginPage();
		cpchange = new ChangePasswordPage();

		CusLoginPage.clickOnLoginLink();

		cuslogin.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
		cuslogin.clickOnCPlink();

	}

	@Test
	public void changePasswordTest() {

		cpchange.changePassword(prop.getProperty("oldpassword"), prop.getProperty("cofirmpassword"),
				prop.getProperty("newpassword"));
		/*String text = cpchange.gettext();
		Assert.assertEquals(text, prop.getProperty("text"));
*/	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}

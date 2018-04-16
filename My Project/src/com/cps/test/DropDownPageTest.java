package com.cps.test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Com.CPS.Base.Base;
import com.cps.pages.DropDownPage;

public class DropDownPageTest extends Base {

	DropDownPage DDP;

	public DropDownPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		intialization();
		DDP = new DropDownPage();
	}

	@Test(priority=1)
	public void verifyDropDownBtn() {
		DDP.dropdown();
		 DDP.getDropdownlist();

	}

	@Test(priority=2)
	public void subBranchLoginTest() {
		DDP.dropdown();
		DDP.verifySubBranchLink();
String title=		driver.getTitle();
Assert.assertEquals(title, prop.getProperty("headbranchtitle"));
	}
	
	
	@Test(priority=3)
	public void headBranchLoginTest() {
		DDP.dropdown();
		DDP.verifyHeadBranchLink();
		String title=		driver.getTitle();
		Assert.assertEquals(title, prop.getProperty("headbranchtitle"));

	}
	
	
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}

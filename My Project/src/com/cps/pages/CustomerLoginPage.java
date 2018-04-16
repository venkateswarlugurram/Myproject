package com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class CustomerLoginPage extends Base{

	@FindBy(xpath="//a[text()='Login']")
	WebElement loginBtn;
	

	
	@FindBy(xpath="//h2[text()='Account Log In']")
	WebElement titletext;
	
	public CustomerLoginPage() {
		PageFactory.initElements(driver, this);
	}
	public String verifyCusLoginPage() {
	return	driver.getTitle();
	}
	
	
	public CustomerLoginPage clickOnLoginLink() {
		Boolean status=	loginBtn.isDisplayed();
		System.out.println("Login Button sataus"+status);
		loginBtn.click();
	return new CustomerLoginPage();	
		}
	
	}

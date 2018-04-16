package com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class ChangePasswordPage extends Base {

	

	@FindBy (xpath="//label[text()='Old Password']//following-sibling::input")
	WebElement oldpassword;
	
	@FindBy (xpath="//label[text()='Confirm Old Password']//following-sibling::input")
	WebElement confirmoldpassword;
	
	@FindBy (xpath="//label[text()='New Password']//following-sibling::input")
	WebElement newpassword;
	
	@FindBy (xpath="//button[text()='Submit ']")
	WebElement submit;
	

	@FindBy (xpath="//h2[text()='ENTERED WRONG PASSWORD']")
	WebElement text;
	
	public ChangePasswordPage() {
		PageFactory.initElements(driver, this);
	}
		
		
		public void changePassword(String oldpass,String confirmpass,String newpass) {
			oldpassword.sendKeys(oldpass);
			confirmoldpassword.sendKeys(confirmpass);
			newpassword.sendKeys(newpass);
		
			submit.click();
			//return	text.getText();	
		}
		

		public String gettext() {
			
	return		text.getText();	
		}
		
		
}

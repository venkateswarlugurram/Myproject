package com.cps.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class IMFSTransferPage extends Base {

	@FindBy(id="accountNumber")
	WebElement accountnumber;
	
	@FindBy(id="IFSC")
	WebElement ifsc;
	
	@FindBy(xpath=" //label[text()='FROM SAVING/CREDIT ::']//following sibing:")
	WebElement savings;
	
	@FindBy(id="amount")
	WebElement amount;
	

	@FindBy(xpath="//button[text()='Submit ']")
	WebElement submit;
	
	
	public IMFSTransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void makeImFSTransaction(String acNum,String IFSC,String money) {
		
		accountnumber.sendKeys(acNum);
		ifsc.sendKeys(IFSC);
	//	savings.click();
		amount.sendKeys(money);
		submit.click();
	}
	
	
	
	
	
	
}

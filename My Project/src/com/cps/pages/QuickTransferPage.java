package com.cps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class QuickTransferPage extends Base {
	@FindBy(id = "accountNumber")
	WebElement accNum;

	@FindBy(id = "IFSC")
	WebElement IFSC;

	@FindBy(id = "amount")
	WebElement amount;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitBtn;

	@FindBy(xpath = "//input[@type='radio']")
	List<WebElement> radioBtns;

	public QuickTransferPage() {

		PageFactory.initElements(driver, this);
	}

	public void quickTransferTransAction(String accountNumber, String ifsccode, String money) throws Exception {
		accNum.sendKeys(accountNumber);
		IFSC.sendKeys(ifsccode);
		amount.sendKeys(money);
		System.out.println(radioBtns.size());
		for (int i = 0; i < radioBtns.size(); i++) {
			Thread.sleep(5000);
			System.out.println(radioBtns.get(i).getText());
			if (radioBtns.equals("CREDIT")) {
				radioBtns.get(i).click();
			}
		}
		submitBtn.click();
		
	}

}

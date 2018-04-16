package com.cps.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Com.CPS.Base.Base;

public class TransferTOAnotherPage extends Base {

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

	/*
	 * @FindBy (id="bankName") WebElement dropdown;
	 */
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> checkboxes;

	@FindBy(id = "Comment")
	WebElement comme;

	public TransferTOAnotherPage() {
		PageFactory.initElements(driver, this);
	}

	public void makeTransToAnotherBank(String AcNum, String ifsc, String money, String country, String comment)
			throws Exception {

		accNum.sendKeys(AcNum);
		IFSC.sendKeys(ifsc);
		amount.sendKeys(money);

		for (int i = 0; i < radioBtns.size(); i++) {
			Thread.sleep(5000);
			System.out.println(radioBtns.get(i).getText());
			if (radioBtns.equals("CREDIT")) {
				radioBtns.get(i).click();
			}
		}

		for (int j = 0; j < checkboxes.size(); j++) {
			Thread.sleep(5000);
			System.out.println(checkboxes.get(j).getText());
		}

		Select s = new Select(driver.findElement(By.id("bankName")));
		s.selectByVisibleText(country);

		comme.sendKeys(comment);
		submitBtn.click();

	}

}

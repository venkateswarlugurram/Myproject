package com.cps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class LoginPage extends Base {

	
	
	@FindBy(id="userId")
	WebElement userName;
	
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	

	@FindBy(xpath="//a[text()='Change Password']")
	WebElement changepasslink;
	
	@FindBy(xpath="//a[text()='TRANSFER']")	
	WebElement transferlink;
	
	
	@FindBy(xpath="//ul[@class='dropdown-menu']")	
	public static List<WebElement> links;

	@FindBy(xpath="//a[text()='QUICK TRANSFER']")	
	WebElement QUICKlink;

	
	@FindBy(xpath="//a[text()='TRANFER TO OTHER BANK']")	
	WebElement TransferTOAnother;

	@FindBy(xpath="//a[text()='IMFS MMID  TRANSFER']")	
	WebElement IMFSTransfer;


				
	
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	

	public HomePage verifyLogin(String un,String Pass) {
		userName.sendKeys(un);
		password.sendKeys(Pass);
		submitBtn.click();
		
		return new  HomePage();
	}
	
	
	public ChangePasswordPage clickOnCPlink() {
		
		changepasslink.click();
		return new ChangePasswordPage();
		
	}

	public void clickOnTransferLink() {
		Actions action =new Actions(driver);
			action.moveToElement(transferlink).build().perform();
		
			
	}

	
		public List<WebElement> getDropdownValues() {
			
			for(int i=0;i<links.size();i++) {
		System.out.println(links.get(i).getText());
				
			}
		return links;
		}

		public QuickTransferPage clickOnQuiukTransferlink() {
			
			QUICKlink.click();
			return new QuickTransferPage();
		}
		
public TransferTOAnotherPage clickOnTransferTOAnotherTransferlink() {
			
	TransferTOAnother.click();
			return new TransferTOAnotherPage();
		}
		
public IMFSTransferPage clickOnIMFSTransferlink() {
	IMFSTransfer.click();
	return new IMFSTransferPage();
	
}		
		
		
		
		
	
}

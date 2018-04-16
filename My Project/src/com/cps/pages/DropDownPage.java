package com.cps.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Com.CPS.Base.Base;

public class DropDownPage extends Base {
	
	
	@FindBy(xpath = "//a[@class='dropdown-toggle']")
	public static WebElement dropdown;

	@FindBy(xpath = "//ul[@class='dropdown-menu']//li//a")
public static	List<WebElement> dropdownlist;

	
	@FindBy(xpath="//a[text()='Sub Branch Login']")
	WebElement subBranchlink;
	
	@FindBy(xpath="//a[text()='Head Branch Login']")
	WebElement headBranchlink;
	
	
	
	public DropDownPage() {
		PageFactory.initElements(driver, this);
	}

	public void dropdown() {
		Actions actions = new Actions(driver);
		actions.moveToElement(dropdown).build().perform();}


	public static List<WebElement> getDropdownlist() {
		
		
		for(int i=0;i<dropdownlist.size();i++) {
			System.out.println(dropdownlist.get(i).getText());
			}
		
		return dropdownlist;
	}
	

public SubBranchPage verifySubBranchLink() {
	subBranchlink.click();
	return new SubBranchPage();
}
	
public HeadBranchPage verifyHeadBranchLink() {
	headBranchlink.click();
	return new HeadBranchPage();
	
}	
	

}

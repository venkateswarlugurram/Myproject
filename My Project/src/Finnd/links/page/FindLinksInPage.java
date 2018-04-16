package Finnd.links.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinksInPage {
public static	WebDriver driver;
	static String links;
		static List<WebElement> list;
		
public FindLinksInPage() {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
	
public static String Url(String url) {
	driver.get(url);
	 list=	driver.findElements(By.tagName("a"));
	System.out.println(list.size());
      for(int i=0;i<list.size();i++) {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	links=	list.get(i).getText();
		
	}
		return links;

}
}
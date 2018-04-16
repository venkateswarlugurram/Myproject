package Title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
	public static WebDriver driver;
	public static String title;

	public Library() {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public  String enterUrl(String url) {

		driver.get(url);
		String title = driver.getTitle();
		System.out.println(title);
	return title;
	}
	

	public  void compare(String title, String atitle) {

		if (title.equals(atitle)) {
			System.out.println("titles are matched testcase pass");

		} else {
			System.out.println("titles are not matched testcase failed,,,,,,");
		}
	}
}
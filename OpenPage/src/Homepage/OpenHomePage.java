package Homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenHomePage {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "../OpenPage/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.close();
	}

}

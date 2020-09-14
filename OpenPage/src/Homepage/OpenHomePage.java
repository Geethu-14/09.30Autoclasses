package Homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenHomePage {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "../OpenPage/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement createaccount =driver.findElement(By.id("u_0_2"));
	createaccount.click();
	
	Thread.sleep(2000);
	WebElement First = driver.findElementByCssSelector("input[name='firstname']");
	First.sendKeys("Geethu");
	
	WebElement Second = driver.findElementByCssSelector("input[name='lastname']");
	Second.sendKeys("Kumari");
	
	WebElement mnumber = driver.findElementByCssSelector("input[name='reg_email__']");
	mnumber.sendKeys("9899000000");
	
	WebElement password = driver.findElementByCssSelector("input#password_step_input");
	password.sendKeys("Password1");
	
	Select dobdd = new Select(driver.findElement(By.id("day")));
	dobdd.selectByIndex(10);
	
	Select dobmm = new Select(driver.findElement(By.id("month")));
	dobmm.selectByVisibleText("Dec");
	
	Select dobyy = new Select(driver.findElement(By.id("year")));
	dobyy.selectByValue("1989");
	
	WebElement gender = driver.findElementByCssSelector("input[value='1']");
	gender.click();
	
	Thread.sleep(2000);
	driver.close();
	}

}

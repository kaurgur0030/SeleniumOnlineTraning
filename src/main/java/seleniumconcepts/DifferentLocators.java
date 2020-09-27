package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\test\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
 driver.findElement(By.id("username")).sendKeys("abc");
 driver.close();
	}

}

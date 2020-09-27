package TestNGConcepts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveyMonkeyLogin {
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
	 String actualText =	driver.findElement(By.xpath("//label[contains(text(), 'Enter your username')]")).getText();
	 // in testNG we didn't use if else we have to use assertion for this
	 Assert.assertEquals(actualText, "Enter your username");
	 //validating text
	/* if (actualText.equalsIgnoreCase("Enter your username")) {
		System.out.println("pass");
	} else {
System.out.println("fail");
	}*/
		driver.findElement(By.id("username")).sendKeys("Selenium1234");
		driver.findElement(By.id("password")).sendKeys("Selenium1234@");
		driver.findElement(By.xpath("//button[contains(text(),'LOG IN')]")).click();
 String dashbord=	driver.findElement(By.xpath("//body/div/div[@id='hd']/div/ol/li[1]/a[1]")).getText();
Assert.assertEquals(dashbord, "dashbord","dshbord is not matching");
	/* if (dashbord.equalsIgnoreCase("Dashboard")) {
		System.out.println("pass");
	} else {
System.out.println("fail");
	}*/
		
	}

}

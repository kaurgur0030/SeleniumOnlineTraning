package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeCode {
 WebDriver driver;  // create web driver at class level
 
 //page objects  all your page objects will be defined  at class level
 By username = By.id("username");
 By password = By.id("password");
 By Login = By.xpath("//button[contains(text(),'LOG IN')]");
 By dshbord = By.xpath("//body/div/div[@id='hd']/div/ol/li[1]/a[1]");
 By signuplink = By.linkText("Sign up");
 // in real time you have two mwthods before method, aftermethod all tests are comes between these
 @BeforeMethod
  public void setup() { // all web driver concept and properites concept goes here
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
  }
 
 @Test
 public void signup() {
	 Assert.assertTrue(driver.findElement(signuplink).isDisplayed());
 }
 
 @AfterMethod
   public void tearDown() { //  in this method only one lines of code comes
	   driver.quit();
}
}

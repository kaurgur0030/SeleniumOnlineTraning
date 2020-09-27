package TestNGConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	
	@Test(dataProvider ="getdata")   // to get data from another method we have to use concept @Test(dataProvider ="getdata")
	public void login(String username, String password) {
	//	System.out.println( username+"-------------"+password );
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[contains(text(),'LOG IN')]")).click();
	 String logeduser =	driver.findElement(By.id("userAcctTab_MainMenu")).getText(); // to validate we can use this line of code
	 String user = logeduser.trim();
	 SoftAssert sa = new SoftAssert();
	 sa.assertEquals(user, username);
	 sa.assertAll(); // to filter everything
	 
	 
	}
	
	@DataProvider
	public Object[][] getdata(){// data provider class there will be a another method where all data will be saved in state of object array  we can call it into another method 
		// where we want to apply this data
		  Object[][] ud = new   Object[2][2];
		  ud[0][0] ="Selenium1234";
		  ud[0][1]= "Selenium1234@";
		  ud[1][0] ="Selenium1234";
		  ud[1][1]= "Selenium1234@";
		  return ud;
	}

}

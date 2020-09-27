package TestNGConcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertiesConcept {;
	WebDriver driver;
	@Test
	public void login() throws IOException {
		 Properties prop = new Properties();   /// link properties file to this class
		 FileInputStream fil = new FileInputStream("C:\\Users\\Simran\\eclipse-workspace\\Selenium\\config.properties");
		 prop.load(fil);    // to load file
		 // read values from file
		 String retusername = prop.getProperty("username");
		 String retpassword = prop.getProperty("password");
		 String retbrowsertype = prop.getProperty("browsertype");
		 
		 String returl = prop.getProperty("url");
		 
		 if (retbrowsertype.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
		} else if (retbrowsertype.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
		 driver = new InternetExplorerDriver();
		} else {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 
		}

		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(returl);
		driver.findElement(By.id("username")).sendKeys(retusername);
		driver.findElement(By.id("password")).sendKeys(retpassword);
		driver.findElement(By.xpath("//button[contains(text(),'LOG IN')]")).click();
		driver.quit();

	}
}
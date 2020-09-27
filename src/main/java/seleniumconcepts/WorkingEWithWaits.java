package seleniumconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingEWithWaits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver(); 
		// waits implicitlyWait working globally with all class
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 String fbtitle = driver.getTitle();
	
		 System.out.println(fbtitle);
		 
		 driver.findElement(By.linkText("Create New Account")).click();
	
		 driver.findElement(By.id("cookie-use-link")).click();
		 
		 //2. Explicit wait 
		 WebDriverWait wait = new WebDriverWait(driver,3);
		 wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		 driver.findElement(By.id("email")).sendKeys("Simran");
	}

}

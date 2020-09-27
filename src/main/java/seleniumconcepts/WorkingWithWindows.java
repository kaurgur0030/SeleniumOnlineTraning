package seleniumconcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		 String fbtitle = driver.getTitle();
	/*	Set<String> wIDs = driver.getWindowHandles();
		System.out.println(wIDs.size());*/
		 System.out.println(fbtitle);
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Create New Account")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.id("cookie-use-link")).click();
			Set<String> wIDs1 = driver.getWindowHandles();
			
		 Iterator<String> itr =	wIDs1.iterator();
		 String fw = itr.next();
		 String sw = itr.next();
		
			System.out.println( fw +"-------------------------------"+sw);
			driver.switchTo().window(sw);
		 String cptitle =driver.getTitle();
		 System.out.println(cptitle);
	}

}

package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.sportsexperts.ca/en-CA/women");
		// count the number of images on webpage
		 List<WebElement>  imgs =driver.findElements(By.tagName("img"));
		 System.out.println(imgs.size());
		 // to get src of all images
		 for (int i = 0; i < imgs.size(); i++) {
			 String img = imgs.get(i).getAttribute("src");
			 System.out.println(img);
			
		}
		 

	}

}

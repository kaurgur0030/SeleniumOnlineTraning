package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
	// we have to switch this inside frame
		driver.switchTo().frame(0);
		//1. to capture drag text
	/* String dragtxt =	driver.findElement(By.id("draggable")).getText();
	 System.out.println( dragtxt);
	//2. to capture drop text
	 String droptxt =	driver.findElement(By.id("droppable")).getText();
	 System.out.println(  droptxt);*/
		  //3. drag and drop
		WebElement a = driver.findElement(By.id("draggable"));
		WebElement b = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		// actions class is used to perfome actions with mouse
		Actions actions = new Actions(driver);
		actions.dragAndDrop(a, b).build().perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();

	}

}

package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingclassWithDropDowns {

	public static void main(String[] args) throws InterruptedException {
		String expmnth ="mar";
		 boolean status = false;
		 	WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.facebook.com/");
		// click on a button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(2000);
		// select avalue from dropdown by using send keys
	//	driver.findElement(By.id("month")).sendKeys("jan");
		// select a value from dropdown with selectclass /visible text
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Mar");
		//Select by Index
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByIndex(5);
// select by value
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1997");
		 Thread.sleep(3000);
	//	3. counting number of value from dropdown
	 List<WebElement> month =	select.getOptions();
	 System.out.println(month.size());
	 for (int i = 0; i <month.size(); i++) { // print all values
	String printmnth =	 month.get(i).getText();
	System.out.println("all month ="+printmnth);
/*	if (printmnth.equalsIgnoreCase(expmnth)) {
		status= true;
		break;
	} else {
status = false;

	}*/
	 // print all element with0ut select class impoetant interview question how to automayte element without select class
	/* List<WebElement> withoutselect =    driver.findElements(By.xpath("//*[@id='day']/option"));
	 for (int i = 0; i < withoutselect.size(); i++) {
	 String day =	 withoutselect.get(i).getText();
		System.out.println(day);*/
		// select a particular date
	// }
	// another method without using select class
		if(printmnth.equals("May")) {
			month.get(i).click();
			break;            
		}
		
	}

	 
	}
	}




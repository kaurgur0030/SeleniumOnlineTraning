package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithLinks {

	public static void main(String[] args) {
		String expLink ="abcd";
		boolean status = false;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // all we have to write in one class
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
		//1. click on link
		// driver.findElement(By.linkText("Log in with SSO")).click();
		//2. capture link text
		  String link =driver.findElement(By.linkText("Log in with SSO")).getText();
		  System.out.println(link);
		  //3. count no of links
		  List<WebElement>  links= driver.findElements(By.tagName("a"));
		  int totallinks = links.size();
		  System.out.println( "total no of links is-----------" +totallinks);
		  //4. print all link name pratical use of for loop
		  for (int i = 0; i < totallinks; i++) {
			  
		String linkname	  =  links.get(i).getText();
		if (!(linkname.isEmpty())) { // dont want to print empty links
			System.out.println("link name is"+linkname );
		}
		// System.out.println("link name is"+linkname );
			//5. verity if some link is present
		/*if (linkname.equalsIgnoreCase(expLink)) {
		//	System.out.println("link is there");
			status = true;
			break; // teriminate your loop
		} else {
			//System.out.println("link is  not there");
			status = false;
		}
		  }
		if (status == true) {
			System.out.println("link is there");
		} else {
			System.out.println("link is  not there");
		
		}*/

	}
	}
}

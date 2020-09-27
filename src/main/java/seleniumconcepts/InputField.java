package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputField {

	public static void main(String[] args) throws InterruptedException {
		
		// in real time we use these all common lines of code in the way of inheritance 
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); // all we have to write in one class
	driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu"); //   driver.get is used to open application
	WebElement uID =   driver.findElement(By.id("username"));
	uID.sendKeys("abc"); // sendkeys for entering values in input field
	
	Thread.sleep(2000);
//	2 clear the   previous value in input field
	uID.clear();
	 Thread.sleep(2000);
	 uID.sendKeys("abcde"); //  add new value
		Thread.sleep(2000);
		
		//3, capture the value that is entered in input field
		 String inputval =  uID.getAttribute("value");
		 System.out.println( inputval);
		 // how do you verify that user name is entered we need condition statement for this
		 System.out.println(inputval.isEmpty());
		 if ( inputval.isEmpty()) {
			System.out.println("value is not entered");
		} else {
			System.out.println("value is  entered");
		}
		 
		/*//3, capture the value that is link
		 String linkval =  driver.findElement(By.linkText("Forgot username or password?")).getText();
		 System.out.println( linkval);
		 */
	}

}

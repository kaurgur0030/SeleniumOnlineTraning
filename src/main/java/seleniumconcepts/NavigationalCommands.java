package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\test\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		// driver.get("https://www.amazon.com/");
		 //  this concept is called method overloading in java because here to is method name
	// 	  ther is difference between  bith get and naviagte but get wait for page to load completely
		 // but naviagte it will wait until title eill be dieplayed driver.get is prefererd one 
		 driver.navigate().to("https://www.amazon.com/");;
		//  driver.navigate().to(url);;
		  driver.navigate().back();  // go back
		  driver.navigate().forward(); // came back to mazon
		  driver.navigate().refresh(); // refresh your page

	}

}

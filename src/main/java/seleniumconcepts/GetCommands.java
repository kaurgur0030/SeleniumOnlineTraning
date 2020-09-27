package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\test\\chromedriver.exe");
	WebDriver  driver = new ChromeDriver();
	 driver.get("https://www.google.com/");
	 String apptitle = driver.getTitle();
	 
	 driver.manage().window().maximize();  // maximise the window
	 
System.out.println(apptitle);

// if is using to verify /compare some values
if(apptitle.equalsIgnoreCase("google")) {
	System.out.println("Google opens");
} else {
	System.out.println("test fails");
}
String appurl = driver.getCurrentUrl();   // to get url
System.out.println(appurl);

// in if condition contains is used to check something which is present or not
if(appurl.contains("google")) {
	System.out.println("url is correct");
} else {
	System.out.println("url is not correct");
}
//this command is using for get page source
   System.out.println(driver.getPageSource());
 driver.close();// to close the application // this is one test case your end to end script
     

}
}
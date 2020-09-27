package TestNGConcepts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyGoogleApp {
	//same code as selenium
	@Test
	public void launchapp() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
	 String apptitle =	driver.getTitle();
	 System.out.println(apptitle);
	 if (apptitle.equalsIgnoreCase("Amazon.ca: Ready for School: Video Games: Video Games")) {
		System.out.println("pass");
	} else {
System.out.println("fail");
	}
	}

}

package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {
		// to set up chrome driver
WebDriverManager.chromedriver().setup();
WebDriver driver =  new ChromeDriver();    // alunch chrome browser to eclipse
driver.get("https://www.google.com/");
String apptitle = driver.getTitle();
System.out.println( apptitle );
	}

}

package seleniumconcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingwithScreenshots {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =  new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); 
		//1. Capturing the ss 
	 File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // 2. paste it
	 FileUtils.copyFile(src, new File  ("./target/Screenshots/File1.png"));

}
}
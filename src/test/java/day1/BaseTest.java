package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

	public static void main(String[] args) throws InterruptedException {
		
		//  Selenium - Selenium is an automation tool which will help us to test ui based web applications
		// starting with https
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");
		
	// Webdriver is an Interface 
	
	WebDriver driver = new ChromeDriver();
	
	// Code to maximize ur google screen 
	driver.manage().window().maximize();
	
		// Methods to pass a url ??
		driver.get("https://www.google.com/");
		
	driver.manage().window().minimize();
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.close();
		
	}

}

package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebsite {

	public static void main(String[] args) {
		
		// https://www.saucedemo.com/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		//  Locating 
		
		// Element  - What ever we are seeing in website is considered as element / elements 
		
		//  Elements - Collection of Element 
		
		// Dom Structure - Page codes where we can get the locators path
		
	}

}

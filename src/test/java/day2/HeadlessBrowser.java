package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		
		// Headless Browser - There will be no UI launched in UI 
		// In backend UI will be launched which will not be visible 
		
		// This can be achieved using chromeoptions 
		
		ChromeOptions co = new ChromeOptions();
		// It is deprecated in latest version
		// co.setHeadless(true);
		co.addArguments("--headless=new");
		
		// We are overloading the chromeoptions to chromedriver 
		
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		System.out.println("Maximized");
		driver.get("https://www.google.com/");
		
		// To get the title :
		String title = driver.getTitle();
		String currurl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currurl);
		
		
		

	}

}

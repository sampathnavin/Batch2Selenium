package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class availablemethodsindriver {
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		// To get the title :
		String title = driver.getTitle();
		String currurl = driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(currurl);
		
		// driver.quit();
		
		// 	driver.close();
		
		
		// Quit will terminate the browser 
		
		// close will close the current tab
	}

}

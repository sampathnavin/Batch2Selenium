package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
	
		
		
		//  Absolute Xpath - Starting with HTML it will navigate to ur mentioned tag name/ webelement 
		
		// It will start with  /
		
		// Relative Xpath - Directly it will fetch the tag names 
		
		// It will start with // 
		
		//  Most used XPATH is Relative xpath
		
		// tagame[contains (@attribute, value)]  -- 100 %%%
		
		// tagname[text()= ' ']  -- 100 %%%
		
		// tagname[starts-with(@attribute, "value"]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		// LINK TEXT 
		// PARTIAL LINK TEXT 
		// XPATH
		
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
		
		
		WebElement linkin = driver.findElement(By.xpath("//a[text() = 'LinkedIn']"));
		System.out.println(linkin.getText());
		System.out.println(linkin.getTagName());
		
	
		
	
		
		
		

	}

}

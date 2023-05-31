package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
	
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
		
		
		WebElement linkin = driver.findElement(By.linkText("LinkedIn"));
		System.out.println(linkin.getText());
		System.out.println(linkin.getTagName());
		
		WebElement fb = driver.findElement(By.partialLinkText("Face"));
		System.out.println(fb.getText());
		System.out.println(fb.getTagName());
		
	
		
	}

}

package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebSause {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));	
		WebElement login = driver.findElement(By.id("login-button"));
		
		String log = driver.getCurrentUrl();
		
		System.out.println(log);
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String hom = driver.getCurrentUrl();
		
		System.out.println(hom);
		
		if(log.equals(hom))
		{
			System.out.println("Login Failed");
		}
		else 
		{
			System.out.println("Logged in Successfully");
		}
		
		
	}

}

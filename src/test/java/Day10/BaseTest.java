package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver  =  null  ;
	
	public BaseTest(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	
	public void base()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
	}
	
	public void login()
	{
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.name("password"));	
		WebElement login = driver.findElement(By.id("login-button"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
	}
	
	

}

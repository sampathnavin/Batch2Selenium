package Day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	
	WebDriver driver ;
	WebDriverWait wait ;

	
	
	@BeforeTest 
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@Test
	public void login()
	{
		driver.get("https://www.saucedemo.com/");
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException
	{
		Thread.sleep(4000);
		driver.close();
	}
	
	

}

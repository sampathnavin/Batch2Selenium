package rough;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BAse {
	
	WebDriver driver = null ;
	
	public BAse(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	public void bases()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	}
	
	public void login()
	{
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
	}

}

package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
	// Handling the windows/tab 

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
		
		WebElement linkin = driver.findElement(By.linkText("LinkedIn")); 
		linkin.click();
		
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow );
		Set<String> windows =   driver.getWindowHandles();
		
		
		List<String> setofwindows = new ArrayList<String>(windows);
		
		String newwindow = setofwindows.get(1);
		
		System.out.println(newwindow );
		
		// This is how we will be switching the windows 
		
		driver.switchTo().window(newwindow);
		driver.close();
		
		
		// There is a method to jump back to parent window 
		
		driver.switchTo().window(parentwindow);
		
		
		driver.close();
		
		
		
		
		
	
		
		
		
		
	}

}

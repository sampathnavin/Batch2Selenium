package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		
		
		// //input[@placeholder = 'Enter name'] 
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder = 'Enter name'] "));
		username.sendKeys("Navin");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lname']"));
		lastname.sendKeys("Sampath");
		
		
		// -1 index
		//driver.switchTo().defaultContent();
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src = 'innerFrame']"));
		
		driver.switchTo().frame(innerframe);
		
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		
		email.sendKeys("trainwithnavins@gmail.com");
		
		// the flow will be frame -- > inner frame 
		
		// the flow for frame to frame switch to parent frame and then switch to to another frame
		
		driver.switchTo().parentFrame();
		

	}

}

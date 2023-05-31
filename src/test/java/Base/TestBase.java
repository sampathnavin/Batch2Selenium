package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver ;
	
	public static void intilize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	
	// ScreenShot method
	
	// Explicit wait creation 
	
	// Implicit waits 
	
	
}

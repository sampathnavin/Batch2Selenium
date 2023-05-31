package rough;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		//  - Interface - TakeScreenShots which will helps us to take screenshots
		//  Type casting mimicking the datas to be similar 
		TakesScreenshot ss =  (TakesScreenshot) driver ;
		File source =  ss.getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\ss.png");
		try {
			FileHandler.copy(source, desti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}

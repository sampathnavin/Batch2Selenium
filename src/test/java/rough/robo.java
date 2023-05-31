package rough;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver();
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		// Robot is class 
		
		Robot r = null;
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ToolKit is an inbuild class which will give u ur screen size
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		// Constructor Overloading
		Rectangle r1 = new Rectangle(screensize);
	
		
		
		Actions ac = new Actions(driver);
		
		WebElement rightclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		// Method to right click 
		
		ac.contextClick(rightclick).build().perform();
		
		WebElement opt = driver.findElement(By.xpath("//li[contains(@class, 'context')][2]"));
		opt.click();
		
		BufferedImage Source = r.createScreenCapture(r1);
		File desti = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\ssrobo.png");
		
		// ImageIO.write(Source file, format name, where u want to place)
		try {
			ImageIO.write(Source, "png", desti);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

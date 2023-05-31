package Day9;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoboClass {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		
		// Robot is a class
		
		Robot r = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rr1 = new Rectangle(screensize);
		
		BufferedImage br = r.createScreenCapture(rr1);
		
		File desti = new File("C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\resources\\TC-02robo.png");
	
	try {
		ImageIO.write(br, "png", desti);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}

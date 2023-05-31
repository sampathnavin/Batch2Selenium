package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions a = new Actions(driver);
		
		List<WebElement> div = driver.findElements(By.xpath("//div[@id = 'dropContent']/div"));
		List<WebElement> div2 = driver.findElements(By.xpath("//div[@id = 'countries']/div"));
		Point ew = null ;
		Point ew1 = null;
		
		System.out.println();
		for(WebElement e : div)
		{
			System.out.println(e.getText());
			for(WebElement e1 : div2)
			{
				System.out.println(e1.getText());
				if(e.equals("Oslo"))
				{
				ew = e.getLocation() ;
				}
				if (e1.equals("Italy"))
				{
				 ew1 = e1.getLocation() ;
				}
				
					
			}
		}
		
		System.out.println(ew);
		System.out.println(ew1);

}
}

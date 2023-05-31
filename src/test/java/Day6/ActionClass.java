package Day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions a = new Actions(driver);
		
		// Actions - Actions that are performed eg : right click double click
		// drag and drop are said to be actions 
		
		WebElement right = driver.findElement(By.xpath("//span[(text() = 'right click me')]"));
		
		//  Right click in actions class there is context click method is there
		
		// Build.perform();
		
		a.contextClick(right).build().perform();
		
		
		List<WebElement> ul = driver.findElements(By.xpath("//ul[contains(@class, 'context-menu-list context-menu-root')]/li/span"));
		
		System.out.println(ul.size());
		
		for(WebElement w : ul)
		{
			System.out.println(w.getText());
			if(w.getText().equals("Copy"))
			{
				w.click();
				break ;
			}
		}
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	}

}

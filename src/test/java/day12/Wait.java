package day12;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io//jQuery-contextMenu//demo.html");
		// There are two types of wait 
		// Implicit Wait //  It wil act as thread.sleep
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions a = new 	Actions(driver);
		WebElement right = driver.findElement(By.xpath("//span[(text() = 'right click me')]"));
		wait.until(ExpectedConditions.visibilityOf(right));
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
		wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}

}

package Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		
		// Practise - u guys can use this website as well https://cosmocode.io/automation-practice-webtable/
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement table = driver.findElement(By.id("customers"));	
		
		List<WebElement> rows =  table.findElements(By.tagName("tr"));
		
		int size = rows.size();
		
		for(WebElement displayrows : rows)
		{
			String text = displayrows.getText();
			System.out.println(text);
		}
		
		for(int i = 2 ; i <= size ; i++)
		{
		
		List<WebElement> company =  driver.findElements(By.xpath("//table[@id = 'customers']/tbody/tr["+i+"]/td[1]"));
		
		for(WebElement discom : company)
		{
			String text = discom.getText();
			System.out.println(text);
		}
		
		}

	}

}

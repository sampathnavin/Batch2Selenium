package Day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\SeleniumTrainingBatch2\\src\\test\\resources\\chromedriver2.exe");	
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		// LINK TEXT 
		// PARTIAL LINK TEXT 
		// XPATH
		
		WebElement un = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		WebElement pass = driver.findElement(By.cssSelector("input[data-test='password']"));
		WebElement log = driver.findElement(By.cssSelector("input[type='submit']"));
		
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
		
		
		WebElement linkin = driver.findElement(By.linkText("LinkedIn"));
		System.out.println(linkin.getText());
		System.out.println(linkin.getTagName());
		
		WebElement fb = driver.findElement(By.partialLinkText("Face"));
		System.out.println(fb.getText());
		System.out.println(fb.getTagName());
		//select[data-test='product_sort_container']

		
		WebElement dropdown = driver.findElement(By.cssSelector("select[data-test='product_sort_container']"));
		
		Select s = new Select(dropdown);
		
		s.selectByIndex(0); 
		
		s.selectByValue("Name (Z to A)");
		
		s.selectByVisibleText("Price (low to high)") ;
		
		
		List<WebElement> l =  s.getOptions();
		
		
		for(WebElement w : l )
		{
			System.out.println(w.getText());
		}
		
		
	}

}

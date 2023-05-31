package Day10;

import org.openqa.selenium.WebDriver;

public class Runner {

	public static void main(String[] args) {
		
		WebDriver driver = null ;
		BaseTest bt = new BaseTest(driver);
		bt.base();
		bt.login();
		
		

	}

}

package rough;

import org.openqa.selenium.WebDriver;

public class Runner  {

	public static void main(String[] args) {
		
		WebDriver driver = null ;
		BAse lb = new BAse(driver);
		lb.bases();
		lb.login();
		

	}

}

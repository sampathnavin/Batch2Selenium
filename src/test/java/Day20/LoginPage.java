package Day20;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	
	@FindBy(xpath="//input[@placeholder ='Username']")
	WebElement username ;
	
	@FindBy(xpath="//input[@placeholder ='Password']")
	WebElement password ;
	

	@FindBy(xpath="//input[@id='login-button']")
	WebElement login ;
	
	@FindBy(xpath = "//div[text() = 'Swag Labs']")
	WebElement test;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginvalidation()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
	}
	
	public void successvaliation()
	{
		String p = test.getText();
		if(p.equals("Swag Labs"))
		{
			System.out.println("Test is Passed");
		}
	}
	
	public void close()
	{
		driver.close();
	}
	
	
	
	
	
}

package Day20;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Runner extends TestBase {
	LoginPage lp ;
	
	@BeforeTest
	public void bt()
	{
		intilize();
	}
	
	@Test
	public void run()
	{
		lp = new LoginPage();
		lp.loginvalidation();
		lp.successvaliation();
	}
	
	@AfterTest
	public void cl()
	{
		lp.close();
	}

}

package Day16;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgArchitecture {
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
	}
	
	@Test
	public void TestStarted()
	{
		System.out.println("TestStarted");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after Test");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After Method");
	}
	
}

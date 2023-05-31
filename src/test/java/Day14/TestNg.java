package Day14;


import org.testng.annotations.Test;

public class TestNg {

	
	// TestNg - Will run and execute in ASCII values order of the methods
	
	// TestNg - We can set the priotity 
	
	@Test(priority = 1)
	public void firstlogin()
	{
		System.out.println("Sucess Login");

	}
	
	@Test(priority = 2)
	public void Secondlogin()
	{
		System.out.println("2 nd Sucess Login");
		throw new RuntimeException();

	}
	
	@Test(priority = 3)
	public void thirdlogin()
	{
		System.out.println("3 rd Sucess Login");

	}


}

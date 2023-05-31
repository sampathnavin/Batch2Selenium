package Day15;

import org.testng.annotations.Test;

public class TestNgPhase2 {
	
	
	@Test
	public void testcase1()
	{
		System.out.println("Test Case 1 Passed");
		throw new RuntimeException();
	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase2()
	{
		System.out.println("Test Case 2 Passed");
	}
	
	@Test (dependsOnMethods = "testcase1")
	public void testcase3()
	{
		System.out.println("Test Case 3 Passed");
	}
	
	@Test(dependsOnMethods = "testcase1")
	public void testcase4()
	{
		System.out.println("Test Case 4 Passed");
	}
	
	
	

}

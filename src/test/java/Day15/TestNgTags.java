package Day15;

import org.testng.annotations.Test;

public class TestNgTags {
	
	
	@Test(invocationCount =  5, invocationTimeOut = 1000)
	public void click()
	{
		System.out.println("Click 5 times");
	}

}

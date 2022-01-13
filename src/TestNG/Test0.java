package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {

	@Test
	public void demo()
	{
		Reporter.log("Hello jaan, true");
		Reporter.log("Hello World, False");
		
	}
	@Test
	public void demo1()
	{
		Reporter.log("Hello Disney", true);
		Reporter.log("Hello World", false);
		
	}
}

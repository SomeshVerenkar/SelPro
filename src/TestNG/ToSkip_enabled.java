package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToSkip_enabled {

	@Test(priority = -1, invocationCount = 2, enabled = false)
	public void settings()
	{
		Reporter.log("Settings", true);
		
	}
	
	@Test(priority = -1, invocationCount = 3)
	public void chats()
	{
		Reporter.log("Chats", true);
		
	}
	
	@Test(invocationCount = 3)
	public void calls()
	{
		Reporter.log("Calls", true);//success
		
	}
}

package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {

	@Test(priority = -1)
	public void settings()
	{
		Reporter.log("Settings", true);
		
	}
	
	@Test(priority = -1)
	public void chats()
	{
		Reporter.log("Chats", true);
		
	}
	
	@Test
	public void calls()
	{
		Reporter.log("Calls", true);//success
		
	}
	
}

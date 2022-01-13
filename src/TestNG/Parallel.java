package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	public WebDriver driver;
	
	@Parameters({"browserName"})
	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("");
	}

	@Test
	public void demo(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("");
	}
}

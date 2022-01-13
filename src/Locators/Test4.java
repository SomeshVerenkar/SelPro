package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("admin");
		driver.findElement(By.cssSelector("button[name='login']")).click();//success
	}
}

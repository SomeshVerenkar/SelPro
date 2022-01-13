package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://upstox.com/open-demat-account/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);//to avoid NoSuchElementException
		
		driver.findElement(By.id("txtemail")).sendKeys("s111111");
		driver.findElement(By.id("txtcontact")).sendKeys("s111111");
		driver.findElement(By.id("sendOtpButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (title.equals("Open a Demat Account Online - Demat Account Opening at Upstox"))
		{
			System.out.println("Pass");//to verify title
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();


	}

}

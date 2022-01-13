package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://kite.zerodha.com/");
			driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);//to avoid NoSuchElementException
			
			driver.findElement(By.id("useri)d")).sendKeys("s111111");
			driver.findElement(By.id("password")).sendKeys("s111111");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			if (title.equals("Kite - Zerodha's fast and elegant flagship trading platform"))
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

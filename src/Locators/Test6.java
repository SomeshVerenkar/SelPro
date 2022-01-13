package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);//to avoid NoSuchElementException
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("adminsss");
		driver.findElement(By.xpath("(//div[contains(@class, 'Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB                                                    ')])[1]")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (title.equals("Instagram"))//to verify title
		{
			System.out.println("Pass:home page is displayed");//success
		}
		else
		{
			System.out.println("Fail:home page is not displayed");
		}
		
		driver.close();
	}

}

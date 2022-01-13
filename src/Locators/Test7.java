package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/user/login");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);//to avoid NoSuchElementException
		
		driver.findElement(By.id("email")).sendKeys("samverenkar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ryderb0!_007");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (title.equals(" "))
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

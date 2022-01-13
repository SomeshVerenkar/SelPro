package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);//to avoid NoSuchElementException
		
		driver.findElement(By.id("session_key")).sendKeys("samverenkar@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("Ryderb0!_007");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (title.equals("LinkedIn India: Log In or Sign Up"))
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

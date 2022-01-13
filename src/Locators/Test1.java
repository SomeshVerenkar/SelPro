package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/user/login");
		
		driver.findElement(By.id("email")).sendKeys("samverenkar@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Ryderb0!_007");
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();//success
		
}
}

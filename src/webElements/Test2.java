package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));//pending
		ele.sendKeys("abcd");
		
		ele.clear();
		
		driver.findElement(By.xpath("//input[@type='submit']"));
		driver.close();
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Chiku");
		driver.findElement(By.name("lastname")).sendKeys("Piku");
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Piku");
		
		WebElement dropDown = driver.findElement(By.id("day"));
		Select s = new Select(dropDown);
		s.selectByIndex(7);
		
		WebElement dropDown1 = driver.findElement(By.id("month"));
		Select s1 = new Select(dropDown1);
		s.selectByIndex(9);
		
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select s2 = new Select(dropDown3);
		s.selectByIndex(1994);

		driver.findElement(By.name("sex")).click();
		
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).submit();
		
		


	}

}
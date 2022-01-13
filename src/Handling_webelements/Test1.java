package Handling_webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("199");
		s.selectByVisibleText("INR 300 - INR 399 ( 1 ) ");//This is not working, defect in application
		
		s.deselectByIndex(0);
		s.deselectByValue("199");
		s.deselectByVisibleText("INR 300 - INR 399 ( 1 ) ");//This is not working, defect in application
		
		driver.close();
		
	}

}

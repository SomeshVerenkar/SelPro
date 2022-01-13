package webElements;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.name("q"));
		org.openqa.selenium.Dimension s = ele.getSize();
		int height = s.getHeight();
		System.out.println("Height of the element "+height);//34
		
		int width = s.getWidth();
		System.out.println("Width of the element "+width);//487
		
		driver.close();
	}

}

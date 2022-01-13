package webElements;

import java.awt.Point;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
		org.openqa.selenium.Point loc=ele.getLocation();
		int x = loc.getX();
		System.out.println("x coordinate "+x);//377
		int y = loc.getY();
		System.out.println("y coordinate "+y);//11
		
		driver.close();
	}

}

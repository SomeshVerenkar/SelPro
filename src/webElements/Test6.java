package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
		System.out.println(ele.getAttribute("desktop"));// repair this
		
		driver.close();
	}

}

package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		WebElement ele=driver.findElement(By.name("sex"));
		
		if(ele.isSelected())
		{
			System.out.println("Pass:element is selected");
			ele.click();
		}
		else
		{
	System.out.println("Fail:element is not selected");//passed
	}

	}

}

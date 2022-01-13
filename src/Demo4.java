import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("q")).sendKeys("you");
		
		List<WebElement> option = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]"));
		System.out.println(option.size());
		
		for(WebElement b:option)
		{
		System.out.println(b.getText());	
		}
		driver.close();
	
	}
}

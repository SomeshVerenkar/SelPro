import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Demo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("addresstype")).click();
		driver.findElement(By.xpath("//option[contains(text(), 'Testing')]")).click();
		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(3);
		s.selectByValue("99");
		System.out.println(s.isMultiple());
		
		if(s.isMultiple());
		{
			s.deselectAll();
		}
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for(WebElement b:option)
		System.out.println(b.getText());	
		
		driver.close();
	
	}
}

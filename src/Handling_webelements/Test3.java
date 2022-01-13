package Handling_webelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("cars"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("199");
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())//true
		{
			s.deselectAll();
		}
		
		s.deselectByIndex(0);
		s.deselectByValue("199");
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());//6
		
		for(WebElement b:option)
		System.out.println(b.getText());//passed condition
		
		//driver.close();

	}

}

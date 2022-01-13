package Handling_webelements;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("u_0_2_MJ")).click();//id not working
		WebElement ele = driver.findElement(By.id("month"));
		Select s = new Select(ele);
		s.selectByIndex(6);
		s.selectByValue("9");
		s.selectByVisibleText("Oct");
		System.out.println(s.isMultiple());
		
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		
		s.deselectByIndex(6);
		s.deselectByValue("9");
		s.deselectByVisibleText("Oct");
		
		ArrayList a = new ArrayList();
		
		
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		
		for(WebElement alloption:option)
		{
		String text = alloption.getText();
		System.out.println(text);
		a.add(text);
		}
		System.out.println("***************After sorting****************");
		
	}

}

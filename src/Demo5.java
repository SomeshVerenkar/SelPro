import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://103.91.181.45:9007/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("admin@admin.com");
		driver.findElement(By.id("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).submit();
		
		driver.findElement(By.partialLinkText("Patient")).click();
		driver.findElement(By.xpath("//button[@class=\"btn btn-primary pull-right\"]")).click();
		driver.findElement(By.name("name")).sendKeys("Dice media");
		driver.findElement(By.name("email")).sendKeys("dicemedia@gmail.com");
		driver.findElement(By.name("password")).sendKeys("dicemedia");
		driver.findElement(By.name("address")).sendKeys("Ponda goa");
		driver.findElement(By.name("phone")).sendKeys("956457445");
		
		WebElement ele = driver.findElement(By.name("sex"));
		Select s = new Select(ele);
		s.selectByValue("male");
		
		driver.findElement(By.name("birth_date")).sendKeys("01/01/2000");
		driver.findElement(By.name("age")).sendKeys("50");
		
		WebElement ele1 = driver.findElement(By.name("blood_group"));
		Select s1 = new Select(ele1);
		s1.selectByValue("AB+");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//i[@class=\"entypo-menu\"]")).click();
		
		WebElement ele2 = driver.findElement(By.partialLinkText("http://103.91.181.45:9007/index.php?admin/doctor"));
		Actions a = new Actions(driver);
		a.moveToElement(ele2).perform();
		driver.findElement(By.xpath("//span[text()='Doctor']")).click();
		
		
	}

}

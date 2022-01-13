package ScrollBar;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
  //To take SCREENSHOT
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step1 - Typecasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		//step2 - Access the method
		File src = ts.getScreenshotAs(OutputType.FILE);
		//step3 - Specify the location
		File dest = new File("./Photo/001.png");
		//step4 - Copy paste from src to dest
		FileUtils.copyFile(src, dest);
		
		driver.close();//success
		
	}

}

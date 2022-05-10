package LearnJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaProgram {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String str = "I am Don";
		System.out.println(str.toUpperCase());
		
		
	}

}

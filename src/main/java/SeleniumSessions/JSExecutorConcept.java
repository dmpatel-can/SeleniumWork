package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JSExecutorConcept
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		  
		  JavascriptExecutor js = (JavascriptExecutor) driver;		
	}
}
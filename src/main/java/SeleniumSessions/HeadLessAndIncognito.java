package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessAndIncognito
{
	public static void main(String[] args) throws InterruptedException
	{
//	WebDriverManager.chromedriver().setup();
		
//	ChromeOptions co = new ChromeOptions();
//	co.addArguments("--headless");
//	co.addArguments("--incognito");
	
//	WebDriver driver = new ChromeDriver(co);
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxOptions fo = new FirefoxOptions();
	fo.addArguments("--incognito");	
	WebDriver driver = new FirefoxDriver(fo);
	
	driver.get("https://www.google.ca");
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	driver.navigate().to("https://www.amazon.ca");
	
	driver.quit();
	}
}

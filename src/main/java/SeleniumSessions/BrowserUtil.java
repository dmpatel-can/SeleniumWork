package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil
{
	public WebDriver driver;
	
	public WebDriver launchBrowser(String browser)
	{			
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please Pass The Correct Browser");
		}
		
		return driver;
	}
	
	public void enterUrl(String url)
	{
		driver.get(url);
	}
	
	public void navigateTo(String newurl)
	{
		driver.navigate().to(newurl);
	}
	
	public void getPageTitle()
	{	
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public void findCurrentUrl()
	{
		String cururl = driver.getCurrentUrl();
		System.out.println(cururl);
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
}

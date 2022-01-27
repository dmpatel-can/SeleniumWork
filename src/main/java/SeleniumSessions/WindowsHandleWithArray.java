package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleWithArray
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); // Click on InstaGram
	
// Step-1: Create New Windows IDs
		
		Set<String> windowsSet = driver.getWindowHandles(); //This will return in form of Set String
		List<String> windowsList = new ArrayList<String>(windowsSet); // Convert it in Array List
		String parentWindowID = windowsList.get(0); // Get Parent ID
		String childWindowID = windowsList.get(1); // Get Child ID
		
// Step-2: Switch driver from Parent to Child Window
		
		driver.switchTo().window(childWindowID);
		Thread.sleep(2000);
		driver.close(); // Now driver is Lost
	
// Step-3: Switch Back to Parent Window
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		driver.quit();	
	}
}

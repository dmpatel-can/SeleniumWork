package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleWithIterator
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); // Click on InstaGram

// Iterator is like Array But stores items with No Sequence. So Index cannot be Used
// Step-1: Create New Windows IDs
		
		Set<String> windowsSet = driver.getWindowHandles(); //This will return in form of Set String
		Iterator<String> windowsItrList = windowsSet.iterator(); // This will iterate the Set

		String ParentWindoeID = windowsItrList.next(); //This is 1st Next();; So It will return ParentWindowID
		System.out.println(ParentWindoeID); ////This is 2nd Next() So It will return ChildWindowID
		String ChildWindowID = windowsItrList.next();
		System.out.println(ChildWindowID);
		
// Step-2:
		driver.switchTo().window(ChildWindowID);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(ParentWindoeID);
		driver.quit();		
	}
}

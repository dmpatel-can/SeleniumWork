package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSPaginationConcept
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://babynames.merschat.com/popular.cgi");
		
		List<WebElement> nameList = driver.findElements(By.xpath("//a[contains(text(),'Vidita')]"));
		
		while(true)
		{
			if(!(nameList.size() == 1))
			{
				driver.findElement(By.xpath("//font[text()='Next']")).click();
				nameList = driver.findElements(By.xpath("//a[contains(text(),'Vidita')]"));
			}
			else
			{
				String attriText = driver.findElement
				(By.xpath("(//a[contains(text(),'Vidita')]/parent::font/parent::td/following-sibling::td)[3]//a"))
						.getAttribute("title");
				System.out.println(attriText);
				break;			
			}
		}	
	}
}

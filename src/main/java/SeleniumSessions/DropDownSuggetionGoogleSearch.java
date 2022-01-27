package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownSuggetionGoogleSearch
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://www.google.com/");
		
		ElementUtil etil = new ElementUtil(driver);
		By search = By.name("q");
		etil.doSendKeys(search, "Naveen AutomationLabs");
		
		List<WebElement> suggList = etil.getElements(By.xpath("//b[normalize-space()='github']"));
		System.out.println(suggList.size());
		
		for(WebElement e : suggList)
		{
			System.out.println(e.getText());
		}
	}
}

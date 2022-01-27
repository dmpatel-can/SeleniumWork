package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AttributeValuConcept
{	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://classic.crmpro.com/index.html");
		
		ElementUtil etil = new ElementUtil(driver);
		
		Thread.sleep(2000);
		etil.doClick(By.xpath("//input[@value='Login']"));	
		System.out.println(etil.doIsDisplayed(By.xpath("//input[@value='Login']")));
		
		etil.doGetAttributeValue(By.linkText("Sign Up"), "href");	
	}
}

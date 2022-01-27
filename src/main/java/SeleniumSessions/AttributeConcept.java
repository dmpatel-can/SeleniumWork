package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AttributeConcept
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://www.google.com/");	
		bro.navigateTo("https://www.amazon.ca/");
		
		ElementUtil etil = new ElementUtil(driver);
		By eleText = By.linkText("Deals Store");
		etil.doGetAttributeValue(eleText, "href");
		
		System.out.println(etil.doElementExist(eleText));
		
		
		bro.closeBrowser();
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActionsClickAndSendKeys
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://demo.opencart.com/index.php?route=account/register");
		
		ElementUtil etil = new ElementUtil(driver);
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		
		
		etil.doSendKeysActions(firstName, "Lionell");
		etil.doClickSendKeysActions(lastName, "Messi");
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

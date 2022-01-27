package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MovementByCursorAppearedMenu
{
//Only Element To Element Drag & Drop Possible in Selenium
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("http://mrbool.com/");
		
		ElementUtil etil = new ElementUtil(driver);
		
		
		By contentEle = By.cssSelector("a.menulink");
		By articlesEle = By.linkText("ARTICLES");
		
		etil.doClickOnChildMenu(contentEle, articlesEle);
	
	}
}

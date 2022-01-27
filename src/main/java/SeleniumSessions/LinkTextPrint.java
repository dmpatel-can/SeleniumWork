package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextPrint
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://www.google.com/");	
		bro.navigateTo("https://demo.opencart.com/index.php?route=account/register");
		
		ElementUtil etil = new ElementUtil(driver);
		
		By yosto = By.linkText("Your Store");
		etil.doClick(yosto);
			
		By links = By.tagName("a");
		
		List<WebElement> linklist = etil.getElements(links);
		
		for(WebElement e : linklist)
		{
			String text = e.getText();
			if(!text.isEmpty())
			{
				System.out.println(text);
			}
		}
	
//		for(int i=0; i<linklist.size(); i++)
//		{
//			System.out.println(linklist.get(i).getText());
//		}
		

	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownBySelect
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://www.orangehrm.com/");
		
		ElementUtil etil = new ElementUtil(driver);
		By demo = By.linkText("Get a Free Demo");
		etil.doClick(demo);
		
		By country = By.id("Form_submitForm_Country");

//		etil.doDropDownSelectVisibleText(country, "Canada");
//		etil.doDropDownSelectIndex(country, 0);
//		etil.doDropDownSelectValue(country, "Bahamas");
		etil.doDropDownSelectOption(country, "India");	
	}
}

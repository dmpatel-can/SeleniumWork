package SeleniumSessions;

import java.util.List;
//Assignment: You need to print DropDown Menu without "Select Country"
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentDropDown
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
		
		List<WebElement> countryList = etil.doDropDownSelectPrintList(country);
//		int count = 1;
//		for (int i=1; i<countryList.size(); i++)
//		{
//			String countries = countryList.get(i).getText();
//			System.out.println(count +": "+ countries);
//			count++;
//		}
		int count = 1;
		for(WebElement e : countryList)
		{
			String countries = e.getText();
			System.out.println(count +": " + countries);
			count++;
		}
		

	}
}

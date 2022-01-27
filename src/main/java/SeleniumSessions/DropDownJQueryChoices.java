package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownJQueryChoices
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		
		bro.enterUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		ElementUtil etil = new ElementUtil(driver);
		etil.doClick(By.id("justAnInputBox"));
		
		By choice = By.cssSelector("span.comboTreeItemTitle");

//		etil.doDropDownMultipleChoiceNoSelect(choice, "choice 1","choice 2 2","choice 4","choice 6 2 1");
//		etil.doDropDownMultipleChoiceNoSelect(choice, "choice 51");
		etil.doDropDownMultipleChoiceNoSelect(choice, "All");
	}
}

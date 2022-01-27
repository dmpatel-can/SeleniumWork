package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetMovementCursorByAppear
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://www.spicejet.com/");
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Seat + Meal Combo']")).click();
		
		List<WebElement> addOnList = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar']"));
		int count = addOnList.size();
		System.out.println(count);
		
		List<String> addOnListText = new ArrayList<String>();
		for(WebElement e : addOnList)
		{
			String text = e.getText();
			addOnListText.add(text);
		}
		System.out.println(addOnListText);
		
		
		
	}
}

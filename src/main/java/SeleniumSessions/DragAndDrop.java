package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://jqueryui.com/resources/demos/droppable/default.html");
		
		ElementUtil etil = new ElementUtil(driver);
		WebElement sourceEle = etil.getElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement targetEle = etil.getElement(By.id("droppable"));	
		
		Actions act = new Actions(driver);
		
//		act.dragAndDrop(sourceEle, targetEle).perform();
		
		act.clickAndHold(sourceEle)
			.moveToElement(targetEle)
				.release()
					.build()
						.perform();		
	}
}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class ClickContextClick
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		ElementUtil etil = new ElementUtil(driver);
		WebElement eleRightClick= etil.getElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		act.contextClick(eleRightClick).build().perform();	
		
		List<WebElement> boxEle = etil.getElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]/span"));
		for(WebElement e : boxEle)
		{
			String text = e.getText();
			if(text.equals("Copy"))
			{
				e.click();
				break;
			}
		}
		
		Thread.sleep(2000);
		
		Alert alrt = driver.switchTo().alert();
		System.out.println(alrt.getText());
		alrt.accept();
		
	}
}

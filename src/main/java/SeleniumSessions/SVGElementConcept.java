package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGElementConcept
{
//SVG is the map style element and start with <svg> tag. It has different XPath style
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/alerts-map/#/");
		Thread.sleep(2000);
		List<WebElement> usStatesList = driver.findElements(By.xpath
			("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g']/*[name()='path']"));
		Actions act = new Actions(driver);
		for(WebElement e: usStatesList)
		{
			act.moveToElement(e).perform();
			String state = e.getAttribute("name");
			System.out.println(state);
			
			if(state.equals("California"))
			{
				e.click();
				break;
//				System.out.println(e.getText());	
			}
		}
		
		List<WebElement> caliCountyList = driver.findElements(By.xpath
("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='states']/*[name()='g' and @id='california']/*[name()='g']/*[name()='path']"));
		for(WebElement e : caliCountyList)
		{
			act.moveToElement(e).build().perform();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			WebElement jsEle = (WebElement)js.executeScript("return document.querySelector(\"#\\\\36 073\")");
			jsEle.click();
		}
		
		
	}
}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameConcept
{	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("http://www.londonfreelance.org/courses/frames/index.html");
				
		ElementUtil etil = new ElementUtil(driver);
//		driver.switchTo().frame("main"); // This is by name
		driver.switchTo().frame(etil.getElement(By.name("main"))); //This is by Frame element
		
		System.out.println(etil.doGetElementText(By.xpath("/html/body/h2")));
		
		Thread.sleep(5000);		
	}
}

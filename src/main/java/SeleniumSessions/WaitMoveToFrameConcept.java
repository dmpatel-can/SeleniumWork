package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitMoveToFrameConcept
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		ElementUtil etil = new ElementUtil(driver);
//		By noFrames = By.xpath("");
		By title = By.xpath("/html/body/h2");
		
		
		etil.waitMoveToFrameWithNameOrId("main", 2);
		System.out.println(etil.doGetElementText(title));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
//		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
//		
//		driver.switchTo().frame("main");
//		System.out.println(driver.findElement(noFrames).getText());
		
		
		
		
		
	}
}

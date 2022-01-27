package SeleniumSessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitWebElementConcept
{
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException
	{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By login = By.xpath("(//aside[@id='column-right']/div/a)[1]");
		By telephoneLabel = By.xpath("//label[@for='input-telephone']");
		By footer = By.xpath("//footer//ul[@class='footer-nav']//a");
		Thread.sleep(2000);
		
//Let's Create Wait Element
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement fName = wait.until(ExpectedConditions.presenceOfElementLocated(firstName));
//		fName.sendKeys("Moksha");
		
		ElementUtil etil = new ElementUtil(driver);
		etil.waitDoSendKeys(firstName, "UnderTaker", 1);
		System.out.println(etil.waitGetElementVisibility(telephoneLabel, 2).getText());
		etil.waitDoClick(login, 3);
		
		driver.navigate().to("https://www.freshworks.com/");
		List<WebElement> footerList = etil.waitGetElementsVisibility(footer, 1);
		for(WebElement e : footerList)
		{
			System.out.println(e.getText());
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}

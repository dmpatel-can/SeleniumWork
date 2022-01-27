package SeleniumSessions;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitFluentWaitConcept
{
	static WebDriver driver;
	
	public static void main(String[] args)
	{
		// Interview Question: Diff between WebDriverWait & FluentWait.
		//Answer: No Diff except parent-child
		// WebDriverWait(C)--> FluentWait(C)--> Wait(I) has until();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By register = By.linkText("Register");
		By email = By.xpath("//div/input[@id='input-email']");
		By telephone = By.cssSelector("input#input-telephone.form-control");
		
		ElementUtil etil = new ElementUtil(driver);
		
		etil.waitElementWithFluentWait(register, 2, 5000).click();
		etil.waitElementWithFluentWait(email, 2, 5000).sendKeys("dmpatel@dmail.com");
		etil.waitElementWithWebDriverWait(telephone, 2, 5000).sendKeys("99999999999999008");
		
	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	
}

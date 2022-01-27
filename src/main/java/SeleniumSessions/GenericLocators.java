package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericLocators
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
//Next Step: Always Create WebElement
//Next Step: Actions (click, sendKeys, etc)
		
// Technique: 1
		
//		By username = By.id("input-email"); //saved "Email" locator into username variable
//		By password = By.id("input-password"); ////saved "Password" locator into password variable
//		By signIn = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");
	
//		WebElement emailId = driver.findElement(username); 
//		WebElement pwd = driver.findElement(password);
//		WebElement login = driver.findElement(signIn);
	
//		emailId.sendKeys("mokshapatel1234@zohomail.com");
//		pwd.sendKeys("moksha789");
//		login.click();
		
// Technique: 2 with By locator
		
//		By username = By.id("input-email");
//		By password = By.id("input-password");
//		By signIn = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");
		
//		getElement(username).sendKeys("mokshapatel1234@zohomail.com");
//		getElement(password).sendKeys("moksha789");
//		getElement(signIn).click();		
//		Thread.sleep(3000);	
	
// Technique: 3 with Generic Method with By locator
	
//	By username = By.id("input-email");
//	By password = By.id("input-password");
//	By signIn = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");

// Technique: 4 with Generic Method with By locator (With getElement() & Action Methods)
		
	By username = By.id("input-email");
	By password = By.id("input-password");
	By signIn = By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']");
	
	}	
}

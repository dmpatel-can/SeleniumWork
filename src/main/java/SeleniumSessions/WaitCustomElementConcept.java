package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitCustomElementConcept
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By register = By.linkText("Register");
		By email = By.xpath("//div/input[@id='input-email']");
		By telephone = By.cssSelector("input#input-telephone.form-control");
		
		ElementUtil etil = new ElementUtil(driver);
		
		etil.WaitGetElementCustom(register, 2).click();
		System.out.println(etil.WaitGetElementCustom(telephone, 2).isDisplayed());
		etil.WaitGetElementCustom(email, 2, 5000).sendKeys("Tesla");
			
	}
}
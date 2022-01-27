package SeleniumSessions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitClickElementWhenReady
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By register = By.linkText("Register");
		
		ElementUtil etil = new ElementUtil(driver);
		etil.waitDoClickElementWhenReady(register, 2);		
	}
}

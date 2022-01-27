package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightWrongColorTest
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("dgvc7890.com.@bsbh");
		driver.findElement(By.id("passwd")).sendKeys(Keys.TAB);
		Boolean emailError = driver.findElement(By.cssSelector("div.form-group.form-error")).isDisplayed();
		System.out.println(emailError);	
	}
}

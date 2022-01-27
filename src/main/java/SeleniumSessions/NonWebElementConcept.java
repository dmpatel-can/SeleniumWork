package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NonWebElementConcept
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		ElementUtil etil = new ElementUtil(driver);
/*==================== URL Wait =======================***************/
		System.out.println(etil.waitDoForUrlContain("demo", 2));
		System.out.println(etil.waitDoForUrlToBe("https://demo.opencart.com/", 2));
/*==================== Title Wait =======================***************/
		System.out.println(etil.waitDoTitleContainsPresent("Your", 2));
		System.out.println(etil.waitDoTitleToBePresent("Your Store", 2));
		
		System.out.println(etil.waitDoGetTitleFromFraction("Your", 2));
		System.out.println(etil.waitDoGetTitle("Your Store", 1));
/*==================== Alert Wait =======================***************/
		


		
		
		
		
		
		
		
		
	}
}

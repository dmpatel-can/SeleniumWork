package SeleniumSessions;//*[@id="state-table"]/tbody/tr

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocators
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.aqi.in/dashboard/canada");
		
		WebElement leth = driver.findElement(By.xpath("(//div/p/a[text()='Lethbridge, Canada'])[1]"));
		String lethAqi = driver.findElement(with(By.tagName("p")).toRightOf(leth)).getText();
		System.out.println(lethAqi);
		String lethRank = driver.findElement(with(By.tagName("p")).toLeftOf(leth)).getText();
		System.out.println(lethRank);
		String hope = driver.findElement(with(By.tagName("a")).below(leth)).getText();
		System.out.println(hope);
		
		WebElement alberta = driver.findElement(By.xpath("(//a[normalize-space()='Alberta'])[1]"));
		String good1 = driver.findElement(with(By.tagName("td")).toRightOf(alberta)).getText();		
		System.out.println(good1);
		
		driver.findElements(By.xpath("//*[@id=\"state-table\"]/tbody/tr"));
	}
}

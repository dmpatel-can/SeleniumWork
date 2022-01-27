package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
//To write values in Box and Double Click, Caps Letter etc
public class ActionsKeyBoard
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();//To Open Chrome
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//To do multiple activities, store particular performance area into object		
		WebElement w1 = driver.findElement(By.id("email"));
		
		Actions a1 = new Actions(driver);
//Now Let's move cursor to w1
	
		Action a = a1.moveToElement(w1)
					.click()
					.keyDown(Keys.SHIFT)
					.sendKeys(w1, "dadabhagwan")
					.keyUp(Keys.SHIFT)
					.doubleClick()
					.contextClick()
					.build();
		a.perform();		
	}
}

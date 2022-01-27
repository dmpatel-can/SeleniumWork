package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// driver-->frame-->#shadow-root--> Use JS
// Now Copy JS Path of an element and use it in js.execute as return.
// Formula: js.executeScript("return jsPath"); --Convert To Normal WebElement--> Webelement ele = (WebElement) js.executeScript("return jsPath");

public class JSShadowDomEleHandle
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		  
		driver.switchTo().frame("pact");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement teaEle = (WebElement) js.executeScript("return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")");
		teaEle.sendKeys("Tata Lipton Tea");	
	}
}

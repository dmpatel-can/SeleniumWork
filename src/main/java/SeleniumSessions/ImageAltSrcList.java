package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageAltSrcList
{	
	static WebDriver driver;
	public static void main(String[] args)
	{
		
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://www.google.com/");	
		bro.navigateTo("https://demo.opencart.com/index.php?route=account/register");
		
		ElementUtil etil = new ElementUtil(driver);
		
		By yosto = By.linkText("Your Store");
		etil.doClick(yosto);
		
		By images = By.tagName("img");
		
//		List<WebElement> eleImgList = etil.getElements(images);
//		for(WebElement e : eleImgList)
//		{
//			String altValue = e.getAttribute("alt");
//			String srcValue = e.getAttribute("src");
//			System.out.println(altValue + srcValue);
//		}
		
		List<String> srcList = etil.doGetAttributesValueList(images, "src");
		for (String a : srcList)
		{
			System.out.println(a);
		}
			
	}

}

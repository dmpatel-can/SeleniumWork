package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPopUpConcept
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://www.google.com/");	
		bro.navigateTo("https://www.rediff.com/");
		
		ElementUtil etil = new ElementUtil(driver);
		
		By signIn = By.linkText("Sign in");
		etil.doClick(signIn);
		
		Thread.sleep(2000);
		
		By rem = By.id("remember");
		etil.doClick(rem);
		
		Thread.sleep(2000);
		
		By LogIn = By.name("proceed");
		etil.doClick(LogIn);
		
		Thread.sleep(2000);
		
		Alert alrt = driver.switchTo().alert();
		String alrtText = alrt.getText();
		System.out.println(alrtText);
		
		alrt.accept();
//		alrt.dismiss();		
	}

}

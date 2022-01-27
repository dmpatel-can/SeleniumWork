package SeleniumSessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestRegPage
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		
		driver = bro.launchBrowser("chrome");	
		bro.enterUrl("https://www.google.com/");	
		bro.navigateTo("https://demo.opencart.com/index.php?route=account/register");		
		bro.getPageTitle();
		bro.findCurrentUrl();
		
//		Thread.sleep(2000);
		
//		bro.closeBrowser();
		
//By Locator with Action Method Approach
	//Always Use This Approach:
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By email = By.id("input-email");
		By phone = By.id("input-telephone");
		By pswd = By.id("input-password");
		By confpswd = By.id("input-confirm");
		
		ElementUtil etil = new ElementUtil(driver);
		
		etil.doSendKeys(fname, "Moksha");
		etil.doSendKeys(lname, "Patel");
		etil.doSendKeys(email, "mokshapatel357@zohomail.com");
		etil.doSendKeys(phone, "9991118885");
		etil.doSendKeys(pswd, "moksha@789");
		etil.doSendKeys(confpswd, "moksha@789");
		
//String Locator Values Approach
		
//		String firstname = "input-firstname";
//		String lastname  = "input-lastname";
//		String emaill    = "input-email";
//		String cell		 = "input-telephone";
//		String password  = "input-password";
//		String cpassword = "input-confirm";
//		
//		etil.doSendKeys(firstname, "Yuvraj");
//		etil.doSendKeys(lastname, "Patel");
//	*******************************************************	
		Thread.sleep(2000);
		
		By loginlink = By.linkText("Login");
		
		By search = By.name("search");
		String search1 = "search";
		By yosto = By.linkText("Your Store");
		
//		String registerlink = "Register";
//		
//		String myaclink = "My Account";
		String header1 = etil.doGetElementText(yosto); 
		
  		if(header1.contains("Your Store"))
  		{
  			System.out.println("This Header Test is Pass");
  		}
  		
  		boolean ser = etil.doIsDisplayed(search);
  		System.out.println(ser);
  		if(ser)
  		{
  			System.out.println("Search Test is Pass");
  		}
  		 		
//		etil.doClick(yosto);
		etil.doSendKeys("name", search1, "iphone 11");
//		etil.doClick("linkText", myaclink);
		
		
		
		
		etil.doClick(yosto);
		
//		
		
		
//		bro.closeBrowser();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

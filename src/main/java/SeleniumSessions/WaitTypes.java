package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitTypes 
{public static void main(String[] args){/*
=> Synchronization Between Selenium(Script) & Application

1. Static Wait: sleep(5 seconds) -- Thread.sleep(5000)					
2. Dynamic Wait: Both impli/expli have Polling time is 500 mili secs */
			
/** Implicitly Wait: is a Dynamic and default wait is 0 secs *//*
~~ global wait -- it will be applicable only for all the web elements by default
~~ can not be applied for non web elements: alerts, url, title, PopUp */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		driver.get("https://classic.crmpro.com/index.html");
		//login page: 10 secs
		driver.findElement(By.name("username")).sendKeys("GundaSwami");//5 secs
		driver.findElement(By.name("password")).sendKeys("Gunda1234");//0 secs
		//click on login -- 0 secs
		//home page: 15 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//sel 4
		//driver.manage().timeouts().implicitlyWait(TimeUnit.SECONDS);//sel 3
		//e4 //e5
		//contacts page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//e7 //e8
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//registration page:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		//0 sec: nullify of implicit wait //e10
		
/**=> Explicit Wait: is a High level Dynamic Wait Concept*//*					
~~ not a global wait
~~ it can be applied for a specific element
~~ it can be customized for a specific element as per the use case
~~ For Eg. e1 --> 5 secs , e2 --> no wait, e3 --> 10 secs
~~ it can be applied for all Non-Web elements : alert, url, title
				
^^Selenium Inside Code:
# WebDriverWait(C)-extends-->FluentWait(C)-implements-->Wait(I) has until() method

//FluentWait(C) --> implements --> Wait(I) has until(); method
	1. until -- overridden
	2. individual methods: ignoring(), withMessage(), pollingEvery()
				
//WebDriverWait(C)--extends--> FluentWait (C) 
	//timeoutException() -- protected Own Method
	1. until(); -- Inherited from Wait (I)
	2. ignoring(), withMessage(), pollingEvery(): -- Inherited from FluentWait (C)
*/	
	}
}

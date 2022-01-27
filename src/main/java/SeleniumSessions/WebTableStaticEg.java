package SeleniumSessions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableStaticEg
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

		driver.get("http://demo.guru99.com/test/web-table-element.php");
//th(Back End Coding) = headings in Dark, td = Column, tr = Row
//To get One of the Name of Dark Headings of a Selected Row, Use findElement		
		String s1 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th[1]")).getText();
		System.out.println(s1);
//To get All of the Names of Dark Headings of a Selected Row, Use findElements, just remove [1] in xpath
// Create Interface in data type of List<Webelement> for getting more than one value as a List
		List<WebElement> th = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		System.out.println("Total Heasdings are..."+th.size());
		
//To get All Headings of Selected Row One By One
		for (int i=1; i<=th.size(); i++)
		{
		String n1 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th["+i+"]")).getText();
		System.out.println(n1);
		Thread.sleep(1000);		
		}
		
//To get All Row Names: Put the cursor on particular Row and go to Inspect Element
//Then In Element window, Ri8 Click on tr and get xpath, and remove [1] from xpath
		
		List<WebElement> tr = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(tr.size());
		
//Now, we want Names of All Rows in One Column. Ri8 click on td and copy xpath
//In xpath, remove [1] in tr and replace with "+i+"
		for (int j=1; j<=tr.size(); j++)
		{
		String j1 = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+j+"]/td[1]")).getText();
		System.out.println(j1);
		Thread.sleep(1000);
		}	
	}
}

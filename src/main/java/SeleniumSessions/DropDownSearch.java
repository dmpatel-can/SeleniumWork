package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownSearch
{	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("http://automationpractice.com/index.php");
		
		ElementUtil etil = new ElementUtil(driver);
		
		By search = By.id("search_query_top");
		etil.doSendKeys(search, "Dress");
		
		Thread.sleep(3000);
		
/** Way-1: How to click  a Single SearchBox Suggestion Element by Using same Element XPath **/
		
		etil.doClick(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]"));
		
/** Way-2: How to click  a Single SearchBox Suggestion Element **/
		
//		List<WebElement> searchList = etil.getElements(By.xpath("//div[@class='ac_results']//li"));
//		System.out.println(searchList.size());
//		
//		for(WebElement e : searchList)
//		{
//			if(e.getText().contains("Casual Dresses"))
//			{
//				e.click();
//				break;
//			}
//		}
//		
//		System.out.println(etil.doGetElementText(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1")));
		
//		Actions action = new Actions(driver);
//		
//		WebElement subSearch = etil.getElement(By.name("submit_search"));
//		action.moveToElement(subSearch).perform();
//		
		
		
		
		
		
		
	}
}

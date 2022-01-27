package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableDynamic
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://www.espncricinfo.com/series/ipl-2021-1249214/royal-challengers-bangalore-vs-mumbai-indians-39th-match-1254108/full-scorecard");
	
		System.out.println(getWicketTakerName("Glenn Maxwell"));
		System.out.println(driver.findElements(By.xpath("//a[contains(@target,'_self') and contains(text(),'Glenn Maxwell')]/parent::td/following-sibling::td")).size());
		System.out.println(playerScoreCard("Kyle Jamieson"));
	
		bro.closeBrowser();		
	}
	
	public static String getWicketTakerName(String playerName)
	{
//		String plyrXPath = "//a[text()='"+playerName+"']/parent::td/following-sibling::td";
		String plyrXPath = "//a[contains(@target,'_self') and contains(text(),'"+playerName+"')]/parent::td/following-sibling::td";
		String wicketTakerName = driver.findElement(By.xpath(plyrXPath)).getText();
		return wicketTakerName;
	}
	
	public static List<String> playerScoreCard(String playerName)
	{
		String plyrXPath = "//a[contains(@target,'_self') and contains(text(),'"+playerName+"')]/parent::td/following-sibling::td";
		List<WebElement> plyrScoreEleList = driver.findElements(By.xpath(plyrXPath));
		List<String> plyrScoreCard = new ArrayList<String>();
		
		for(int i=1; i<plyrScoreEleList.size(); i++)
		{
			String text = plyrScoreEleList.get(i).getText();
			plyrScoreCard.add(text);
		}
		return plyrScoreCard;
	}
	
}

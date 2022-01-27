package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTableStatic
{
	static WebDriver driver;
	public static void main(String[] args)
	{
		BrowserUtil bro = new BrowserUtil();
		driver = bro.launchBrowser("chrome");
		bro.enterUrl("https://www.w3schools.com/html/html_tables.asp");
		
		ElementUtil etil = new ElementUtil(driver);
		
//		String row1 = "//table[@id=\"customers\"]/tbody/tr[2]/td[1]";
//		String row2 = "//table[@id=\"customers\"]/tbody/tr[3]/td[1]";
//		String row3 = "//table[@id=\"customers\"]/tbody/tr[4]/td[1]";
//		String row4 = "//table[@id=\"customers\"]/tbody/tr[5]/td[1]";
//		String row5 = "//table[@id=\"customers\"]/tbody/tr[6]/td[1]";
//		String row6 = "//table[@id=\"customers\"]/tbody/tr[7]/td[1]";
		
		int rowCount = etil.doElementsCount(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
		int colCount = etil.doElementsCount(By.xpath("//table[@id=\"customers\"]/tbody/tr[1]/th"));
		
		String BeforeRowXPath = "//table[@id='customers']/tbody/tr[";
		String AfterRowXPath = "]/td[1]";
		
		
//		for(int row=2; row<=rowCount; row++)
//		{	 	
//		//	System.out.println(BeforeXPath+i+AfterXPath);
//			String CompXPath = BeforeRowXPath+row+AfterRowXPath;
//			String CompName = etil.doGetElementText(By.xpath(CompXPath));
//			System.out.println(CompName);	
//		}
		
		for(int row=2; row<=rowCount; row++)
			{
			for(int col=1; col<=colCount; col++)
				{
//		 List <String> tableText = etil.doGetElementsText(By.xpath("//table[@id='customers']/tbody/tr["+row+"]/td["+col+"]"));
//		 System.out.println(tableText);
					String tableXPath = "//table[@id='customers']/tbody/tr["+row+"]/td["+col+"]";
//			System.out.println(tableXPath);
			
					String tableText = etil.doGetElementText(By.xpath(tableXPath));
					System.out.println(tableText);
				}
			System.out.println();
			}		
	}	
}

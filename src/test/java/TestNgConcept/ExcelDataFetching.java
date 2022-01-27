package TestNgConcept;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataFetching
{
	@DataProvider						// DataProvider Formula ~~>
	public Object[][] productData()		// public void productData()
	{									// {
	   return new Object[][]			//	 return new Object[][]
	   {								//		{
	     {"Apple","iphone12"},			//			{"",""}
	     {"Samsung","Galaxy 22"}		//		};
	   };								// }
	}
	
	@Test(dataProvider = "productData")
	public void doSearchTest(String productName, String mainProduct)
	{
		// Use your logic
	}	
}

package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.SearchProduct;
import Utils.BaseTest;

public class SearchProductTest extends BaseTest {
	
	@BeforeMethod
    public void initialize() {
	 initializeBrowser();
    }
		
	@AfterMethod
	public void exit() {
		 teardown();
	}
	@DataProvider(name = "Product")
    public Object[][] getEmptyFirstNameData() {
        return new Object[][] {
        	 {"shoe"}
        };}
	
	
		@Test(dataProvider = "Product")
		
		public void searchProduct(String s ) {
			SearchProduct p = new SearchProduct();
			p.search(s);
			p.browse();
			p.validate();
			
		}

}

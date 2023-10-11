package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
		@Test
		
		public void searchTest() {
			SearchProduct p = new SearchProduct();
			p.search("shoe");
			p.browse();
			p.validate();
			
		}

}

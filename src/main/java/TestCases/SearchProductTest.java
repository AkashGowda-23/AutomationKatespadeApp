package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.SearchProduct;
import Utils.BaseTest;

public class SearchProductTest {
	
	 @BeforeMethod
	    public void initialize() {
	       BaseTest.initializeBrowser();
	    }
		
		@Test
		
		public void searchTest() {
			SearchProduct p = new SearchProduct();
			p.search("shoe");
			p.browse();
			p.validate();
			
		}

}

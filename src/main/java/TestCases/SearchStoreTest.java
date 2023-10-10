package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.SearchStore;
import Utils.BaseTest;

public class SearchStoreTest {
	
	 @BeforeMethod
	    public void initialize() {
	       BaseTest.initializeBrowser();
	    }
		
		@Test
		public void store() {
			SearchStore p = new SearchStore();
			p.searchthestore();
			p.Entertext("new york");
			p.butt();
			p.validate();
		}

}

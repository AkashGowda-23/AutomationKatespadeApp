package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.SearchStore;
import Utils.BaseTest;

public class SearchStoreTest extends BaseTest {
	
	 @BeforeMethod
	    public void initialize() {
		 initializeBrowser();
	    }
	 @AfterMethod
		public void exit() {
			 teardown();
		}

		
		@Test
		public void store() throws InterruptedException {
			SearchStore p = new SearchStore();
			p.searchthestore();
			p.Entertext("new york");
			p.butt();
			p.validate();
		}

}

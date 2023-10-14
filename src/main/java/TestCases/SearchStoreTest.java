package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	 @DataProvider(name = "place")
	    public Object[][] getEmptyFirstNameData() {
	        return new Object[][] {
	        	 {"new york"}
	        };
	        	
	        }

		
		@Test(dataProvider = "place")
		public void searchStore(String s) throws InterruptedException {
			SearchStore p = new SearchStore();
			p.searchthestore();
			p.Entertext(s);
			p.butt();
			p.validate();
		}

}

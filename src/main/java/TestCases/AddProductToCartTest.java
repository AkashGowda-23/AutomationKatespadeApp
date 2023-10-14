package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.AddProductToCart;
import Utils.BaseTest;

public class AddProductToCartTest extends BaseTest {
	
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
        	 {"bracelete"}
        };
        	
        }
		
		@Test(testName="AddProductToCart",dataProvider = "Product")
		public void addtest(String prod) throws InterruptedException {
			AddProductToCart p = new AddProductToCart();
			p.search(prod);
			p.browse();
			p.click();
			p.add();
			p.view();
			p.validatetheproduct();
		}
		
		

}

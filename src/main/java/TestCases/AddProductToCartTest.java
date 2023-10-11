package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
		
		@Test(testName="AddProductToCart")
		public void addtest() throws InterruptedException {
			AddProductToCart p = new AddProductToCart();
			p.search("bracelete");
			p.browse();
			p.click();
			p.add();
			p.view();
			p.validatetheproduct();
		}
		
		

}

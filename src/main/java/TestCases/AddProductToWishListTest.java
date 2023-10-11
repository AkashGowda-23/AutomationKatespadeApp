package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.AddProductToWishList;
import Utils.BaseTest;

public class AddProductToWishListTest extends BaseTest {
	
	@BeforeMethod
    public void initialize() {
	 initializeBrowser();
    }
	@AfterMethod
	public void exit() {
		 teardown();
	}
	 @Test
	 public void wisList() throws InterruptedException {
		 AddProductToWishList p = new AddProductToWishList();
		 p.search("bracelete");
		 p.browse();
		 p.click();
		 p.addtoWish();
		 p.clickWishButton();
		 p.validateWishListItem();
		 
		 
		 
	 }

}

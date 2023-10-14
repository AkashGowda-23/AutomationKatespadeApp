package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
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
	@DataProvider(name = "Product")
    public Object[][] getEmptyFirstNameData() {
        return new Object[][] {
        	 {"bracelete"}
        };
        	
        }
	 @Test(dataProvider = "Product")
	 public void addProductTowisList(String prod) throws InterruptedException {
		 AddProductToWishList p = new AddProductToWishList();
		 p.search(prod);
		 p.browse();
		 p.click();
		 p.addtoWish();
		 p.clickWishButton();
		 p.validateWishListItem();
		 
		 
		 
	 }

}

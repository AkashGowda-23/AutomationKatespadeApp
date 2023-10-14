package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginWithBlankPassword;
import Utils.BaseTest;

public class LoginWithBlankPasswordTest extends BaseTest {
	@BeforeMethod
    public void initialize() {
	 initializeBrowser();
    }
	@AfterMethod
	public void exit() {
		 teardown();
	}
	@DataProvider(name = "userdata")
    public Object[][] getEmptypassword() {
        return new Object[][] {
        	 {"yotiro7168@elixirsd.com",""}
        	
        };
        	
        }
		
		@Test(dataProvider = "userdata")
		public void loginwithBlankPassword(String username,String password) {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail(username);
			p.contButton();
			p.enterPassword(password);
			p.submit();
			p.validatePassword();

	}
		@DataProvider(name = "userdata1")
	    public Object[][] getEmptyemail() {
	        return new Object[][] {
	        	 
	        	 {""}
	        };
	        	
	        }
		
		@Test(dataProvider = "userdata1")
		public void loginwithBlankEmail(String username) {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail(username);
			p.contButton();
			p.validatePassword();

	}

}

package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginWithBlankPassword;
import Utils.BaseTest;

public class LoginWithInvalidPassword extends BaseTest {

	 @BeforeMethod
	    public void initialize() {
	       initializeBrowser();
	    }
	 @AfterMethod
		public void exit() {
			 teardown();
		}
	
		
		@Test
		public void Login1() {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail("Welcome@gmail.com.com");
			p.contButton();
			p.enterPassword("dddd");
			p.submit();
			p.Validateforinvalidpassword();

	}
}

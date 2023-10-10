package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginWithBlankPassword;
import Utils.BaseTest;

public class LoginWithInvalidPassword {

	 @BeforeMethod
	    public void initialize() {
	       BaseTest.initializeBrowser();
	    }
		
		@Test
		public void Login1() {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail("Welcome@gmail.com.com");
			p.contButton();
			p.enterPassword("Weeeeeeee");
			p.submit();
			p.Validateforinvalidpassword();

	}
}

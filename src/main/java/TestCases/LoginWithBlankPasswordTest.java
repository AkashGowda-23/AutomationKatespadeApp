package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.LoginWithBlankPassword;
import Utils.BaseTest;

public class LoginWithBlankPasswordTest {
	 @BeforeMethod
	    public void initialize() {
	       BaseTest.initializeBrowser();
	    }
		
		@Test
		public void Login1() {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail("yotiro7168@elixirsd.com");
			p.contButton();
			p.enterPassword("");
			p.submit();
			p.Validate();

	}

}

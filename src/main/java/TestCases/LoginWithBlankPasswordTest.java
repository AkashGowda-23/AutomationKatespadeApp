package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
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
		
		@Test
		public void Login1() {
			
			LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
			p.enterEmail("yotiro7168@elixirsd.com");
			p.contButton();
			p.enterPassword("");
			p.submit();
			p.validatePassword();

	}

}

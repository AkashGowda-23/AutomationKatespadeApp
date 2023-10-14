package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.OfferEmailSignup;
import Utils.BaseTest;

public class OfferEmailSignupTest  extends BaseTest {

	 @BeforeMethod
	    public void initialize() {
	       initializeBrowser();
	    }
	 @AfterMethod
		public void exit() {
			 teardown();
		}
	 
	 @Test
	 public void EmailSignup() throws InterruptedException {
		 OfferEmailSignup p = new  OfferEmailSignup();
		 p.enterMail("725981101233@gmail.com");
		 p.submit();
		
		 
	 }
	 @Test
	 public void ReEmailSignup() throws InterruptedException {
		 OfferEmailSignup p = new  OfferEmailSignup();
		 p.enterMail("7259811012@gmail.com");
		 p.submit();
		 p.validateEmail();
		 
	 }
	 
	 

}

package TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Login;
import Utils.BaseTest;

public class ValideLoginTest  extends BaseTest{
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
		
		Login p = new Login();
		p.accBuuton();
		p.enterEmail("akash.br.1223@gmail.com");
		p.contButton();
		p.enterPassword("Abcd@2345Wet");
		p.submit();

}
}
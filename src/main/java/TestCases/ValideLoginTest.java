package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Login;
import Utils.BaseTest;

public class ValideLoginTest {
    @BeforeMethod
    public void initialize() {
       BaseTest.initializeBrowser();
    }
	
	@Test
	public void Login1() {
		
		Login p = new Login();
		p.accBuuton();
		p.enterEmail("yotiro7168@elixirsd.com");
		p.contButton();
		p.enterPassword("Aka@Demo12345");
		p.submit();

}
}
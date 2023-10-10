package TestCases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Singup;
import Utils.BaseTest;

public class SingUpTest {
	@BeforeMethod
	public void initalize() {
		BaseTest.initializeBrowser();
		
	}

	
	@Test
	public void Signup1() {
		Singup p = new Singup();
		p.accountButton();
		p.enterfname("abcd");
		p.lastName("cd");
		p.enterEmail("abcd@gmail.com");
		p.enterPassword("Abcd@2345Wet");
		p.enterPhNo("1234567809");
		p.Submit();
		
	}

}

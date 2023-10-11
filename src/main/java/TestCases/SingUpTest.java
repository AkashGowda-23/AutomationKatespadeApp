package TestCases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.Singup;
import Utils.BaseTest;

public class SingUpTest extends BaseTest {
	@BeforeMethod
	public void initalize() {
		initializeBrowser();
		
	}
	@AfterMethod
	public void exit() {
		 teardown();
	}

	
	@Test
	public void Signup1()throws InterruptedException {
		Singup p = new Singup();
		p.accountButton();
		p.enterfname("Project");
		p.lastName("Team5");
		p.enterEmail("akash.br.1223@gmail.com");
		p.enterPassword("Abcd@2345Wet");
		p.enterPhNo("1234567809");
		p.cap();
		p.Submit();
		
	}

}

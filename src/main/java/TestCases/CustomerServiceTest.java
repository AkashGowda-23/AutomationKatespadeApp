package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.Customer;
import Utils.BaseTest;

public class CustomerServiceTest  extends BaseTest {
	
	@BeforeMethod
    public void initialize() {
	 initializeBrowser();
    }
	@AfterMethod
	public void exit() {
		 teardown();
	}
	
	@DataProvider(name = "userdata")
    public Object[][] validdata() {
        return new Object[][] {
        	 {"Order Status","abcd","a","abcd@gmail.com","abcd@gmail.com","abcd@gmail.com"}
        };
	
	}
	@Test(dataProvider = "userdata")
	public void customerCareTest(String dropdown,String text,String text1,String email,String reemail,String ph) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.sendReemail(reemail);
		p.endPh(ph);
		p.submit();
	}
	
	@DataProvider(name = "userdata2")
    public Object[][] blankfname() {
        return new Object[][] {
        	 {"Order Status","abcd","","abcd@gmail.com"}
        };
	
	}
	
	@Test(dataProvider = "userdata2")
	public void customerCareBlankNameTest(String dropdown,String text,String text1,String email) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.blanknamemsg();
		
	}
	@DataProvider(name = "userdata3")
    public Object[][] blankemail() {
        return new Object[][] {
        	 {"Order Status","abcd","a","","abcd@gmail.com"}
        };
	
	}
	
	@Test(dataProvider = "userdata3")
	public void customerCareBlankEmailTest(String dropdown,String text,String text1,String email,String reemail) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.sendReemail(reemail);
		p.blankemailmsg();
		
	}
	@DataProvider(name = "userdata4")
    public Object[][] blankreemail() {
        return new Object[][] {
        	 {"Order Status","abcd","a","abcd@gmail.com","","2345645765"}
        };
	
	}
	@Test(dataProvider = "userdata4")
	public void customerCareBlankReEmailTest(String dropdown,String text,String text1,String email,String reemail,String ph) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.sendReemail(reemail);
		p.endPh(ph);
		p.blankreemailmsg();
		
	}
	@DataProvider(name = "userdata5")
    public Object[][] sameemail() {
        return new Object[][] {
        	 {"Order Status","abcd","a","abcd@gmail.com","abcd@gmail.com","2345645765"}
        };
	
	}
	@Test(dataProvider = "userdata5")
	public void customerCareReEmailNotMatchTest(String dropdown,String text,String text1,String email,String reemail,String ph) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.sendReemail(reemail);
		p.endPh(ph);
		p.Emailnotmatch();
		
	}
	@DataProvider(name = "userdata6")
    public Object[][] phone() {
        return new Object[][] {
        	 {"Order Status","abcd","a","abcd@gmail.com","abcd@gmail.com",""}
        };
	}
	@Test(dataProvider = "userdata6")
	public void customerCareBlankPhonenoTest(String dropdown,String text,String text1,String email,String reemail,String ph) {
		Customer p = new Customer();
		p.accBuuton();
		p.contactus();
		p.dropdown(dropdown);
		p.textarea(text);
		p.entername(text1);
		p.sendEmail(email);
		p.sendReemail(reemail);
		p.endPh(ph);
		p.submit();
		p.blankrphonemsg();
		
	}

}

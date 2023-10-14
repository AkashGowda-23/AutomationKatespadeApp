package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Utils.BaseTest;

public class Customer extends BaseTest {

	public Customer() {
		PageFactory.initElements(super.driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")
	private WebElement Accountbutton;
	
	@FindBy(xpath = "//a[@data-promotion-id='id-Footer'][normalize-space()='Contact Us']")
	private WebElement contactus;
	
	@FindBy(xpath = "//select[@data-qa='cu_drpdwn_tpc']")
	private WebElement dropdown;
	
	@FindBy(xpath = "//textarea[@id='contact-comment']")
	private WebElement testarea;
	
	@FindBy(xpath = "//input[@id='contact-full-name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@id='contact-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='contact-confirm-email']")
	private WebElement reemail;
	
	@FindBy(xpath = "//input[@id='contact-phone-number']")
	private WebElement phno;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_comment']")
	private WebElement blankcomment;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_name']")
	private WebElement blankname;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_email']")
	private WebElement blankemail;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_cnfrm_email']")
	private WebElement blankreemail;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_phnnum']")
	private WebElement blankph;
	
	@FindBy(xpath = "//div[@data-qa='cu_txt_errmsg_cnfrm_email']")
	private WebElement emailnotmatch;
	
	
	

	
	
	
	
	
	
	public void accBuuton() {
		Accountbutton.click();

	}
	
	public void contactus() {
		contactus.click();
		
	}
	public void dropdown(String option) {
		 Select select = new Select(dropdown);
		 select.selectByVisibleText(option);
		
	}
	public void textarea(String s) {
		testarea.sendKeys(s);
		
	}
	public void entername(String s) {
		name.sendKeys(s);
	}
	public void sendEmail(String s) {
		email.sendKeys(s);
	}
	public void sendReemail(String s) {
		reemail.sendKeys(s);
	}
	
	public void endPh(String  s) {
		phno.sendKeys(s);
	}
	
	public void submit() {
		submit.click();
		
	}
	
	public void blankCommentmg() {
		String s = blankcomment.getText();
		Assert.assertEquals(s, "Please add your comments");
	}
	
	public void blanknamemsg() {
		String s =blankname.getText();
		Assert.assertEquals(s, "Enter your full name");	
	}
	public void blankemailmsg() {
		String s =blankemail.getText();
		Assert.assertEquals(s, "Enter your email address");	
	}
	public void blankreemailmsg() {
		String s =blankreemail.getText();
		Assert.assertEquals(s, "Enter your email address");	
	}
	public void blankrphonemsg() {
		String s =blankph.getText();
		Assert.assertEquals(s, "Enter your phone number");	
	}
	public void Emailnotmatch() {
		String s =emailnotmatch.getText();
		Assert.assertEquals(s, "Email addresses do not match");	
	}
	
	
	
	
	
	
	
	
	
	
	

	
	

}

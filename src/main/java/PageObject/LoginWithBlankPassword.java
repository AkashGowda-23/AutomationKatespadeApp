package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import Utils.BaseTest;

public class LoginWithBlankPassword extends BaseTest {

	public LoginWithBlankPassword() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(xpath = "//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")
	private WebElement Accountbutton;

	@FindBy(xpath = "//div[@class='text-input floating-label-wrap form-group required mb-4']//input[@id='login-form-email']")
	private WebElement Email;

	@FindBy(xpath = "//button[normalize-space()='CONTINUE']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//input[@id='login-form-password']")
	private WebElement pasword;

	@FindBy(xpath = "//button[@type='submit'][normalize-space()='SIGN IN']")
	private WebElement Submit;
	
	@FindBy(xpath = "//div[@id='login-form-password-error']")
	private WebElement Reqmsg;
	
	
	@FindBy(xpath = "//p[@class='alert-message coachtopia-alert-message']")
	private WebElement Reqmsgforinvalidpassword;
	
	

	public void accBuuton() {
		Accountbutton.click();

	}

	public void enterEmail(String s) {
		Email.sendKeys(s);

	}

	public void contButton() {
		ContinueButton.click();

	}

	public void enterPassword(String s) {

		WebDriverWait wait = new WebDriverWait(driver, 100); 
		WebElement pasword = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login-form-password']")));
		pasword.sendKeys(s);

	}

	public void submit() {
		Submit.click();

	}
	public void Validate() {
		
		String s = Reqmsg.getText();
		System.out.println(s);
		SoftAssert se = new SoftAssert();
		se.assertEquals(s, "Password is required. It must be 8 or more characters and include at least one number and letter. Password is case sensitive and cannot contain spaces.");
		
		
	}
	
	public void Validateforinvalidpassword() {
		String s = Reqmsgforinvalidpassword.getText();
		System.out.println(s);
		
		
	}

}

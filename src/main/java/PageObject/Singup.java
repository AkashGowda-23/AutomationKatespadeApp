package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseTest;

public class Singup extends BaseTest {

	public Singup() {
		PageFactory.initElements(super.driver, this);
	}

	@FindBy(xpath = "//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")
	private WebElement Accountbutton;

	@FindBy(xpath = "//input[@class='form-control isvalid-fname required validChar']")
	private WebElement Firstname;

	@FindBy(xpath = "//input[@id='registration-form-lname']")
	private WebElement Lastname;

	@FindBy(xpath = "//input[@class='form-control isvalid-email  required']")
	private WebElement Email;

	@FindBy(xpath = "//input[@class='isvalid-password form-control']")
	private WebElement Password;

	@FindBy(xpath = "	//input[@class='form-control isvalid-phoneno']")
	private WebElement Phoneno;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block g-recaptcha js-verify-account-modal-open']")
	private WebElement SubmitButton;

	@FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
	private WebElement captcha;


	@FindBy(xpath = "//div[@id='form-lname-error']")
	private WebElement withoutlnamemsg;

	@FindBy(xpath = "//div[@id='form-fname-error']")
	private WebElement withoutfnamemsg;

	@FindBy(xpath = "//div[@id='register-email-error']")
	private WebElement withoutemailmsg;

	@FindBy(xpath = "//div[@id='form-password-error']")
	private WebElement withoutpswrdmsg;




	public void accountButton() {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement accountButtonElement = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")));
		accountButtonElement.click();

	}

	public void enterfname(String s) {

		Firstname.sendKeys(s);

	}

	public void lastName(String s) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement accountButtonElement = wait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='registration-form-lname']")));
		Lastname.sendKeys(s);

	}

	public void enterEmail(String s) {
		Email.sendKeys(s);

	}

	public void enterPassword(String s) {
		Password.sendKeys(s);

	}

	public void enterPhNo(String s) {
		Phoneno.sendKeys(s);

	}

	public void cap() throws InterruptedException {
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(5000);
		captcha.click();
		driver.switchTo().defaultContent();
	}

	public void Submit() throws InterruptedException {
		Thread.sleep(5000);
		SubmitButton.click();

	}

	public void validatewithoutlname() throws InterruptedException {
		Thread.sleep(5000);
		String s = withoutlnamemsg.getText();
		Assert.assertEquals(s,"Last name is required and must be 30 characters or less.");

	}
	public void validatewithoutfname() throws InterruptedException {
		Thread.sleep(5000);
		String s = withoutfnamemsg.getText();
		Assert.assertEquals(s,"First name is required and must be 30 characters or less.");

	}
	public void validatewithoutemail() throws InterruptedException {
		Thread.sleep(5000);
		String s = withoutemailmsg.getText();
		Assert.assertEquals(s,"Email address is required.");

	}
	public void validatewithoutpassword() throws InterruptedException {
		Thread.sleep(5000);
		String s = withoutpswrdmsg.getText();
		Assert.assertEquals(s,"Password is required. It must be 8 or more characters and include at least one number and letter. Password is case sensitive and cannot contain spaces.");

	}


}

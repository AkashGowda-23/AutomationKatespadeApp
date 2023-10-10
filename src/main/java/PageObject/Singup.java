package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	public void Submit() {
		SubmitButton.click();

	}

}

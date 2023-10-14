package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseTest;

public class OrderStatus extends BaseTest {

	public OrderStatus() {
		PageFactory.initElements(super.driver, this);
	}
	@FindBy(xpath = "//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")
	private WebElement Accountbutton;
	
	@FindBy(xpath = "//a[normalize-space()='Look it up here']")
	private WebElement trackorder;
	
	@FindBy(xpath = "//input[@id='trackorder-form-number']")
	private WebElement orderno;
	
	
	
	@FindBy(xpath = "//button[@value='submit']")
	private WebElement submit;
	
	
	@FindBy(xpath = "//div[@id='form-number-error']")
	private WebElement blankmsg;
	
	@FindBy(xpath = "//div[@class='alert alert-danger ']")
	private WebElement invalidmsg;
	
	
	
	
	
	public void acc() {
		Accountbutton.click();
		
	}
	
	public void orderstatuslink() {
		trackorder.click();
		
	}
	public void orderstatusno(String s) {
		orderno.sendKeys(s);
		
	}
	

	
	public void submit() {
		submit.click();
	}
	
	public void blankmsg() {
		String s = blankmsg.getText();
		Assert.assertEquals(s, "This field is required.");
	}
	
	public void invalidno() {
		String s = invalidmsg.getText();
		System.out.println(s);
		Assert.assertEquals(s, "Order number does not match our records. Please check the number, email address, or billing ZIP code and try again.");
		
	}
}

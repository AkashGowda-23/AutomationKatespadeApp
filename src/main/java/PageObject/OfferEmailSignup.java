package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseTest;

public class OfferEmailSignup extends BaseTest {
	

		public OfferEmailSignup() {
			PageFactory.initElements(super.driver, this);
		}
		
		@FindBy(xpath = "//input[@data-qa='ftr_inp_field_email']")
		private WebElement EnterEmail;
		
		@FindBy(xpath = "//button[@class='chakra-button css-11o6ac4']")
		private WebElement Submit;
		
		@FindBy(xpath = "//*[@id=\"footer\"]/div/div[1]/div/div[2]/form/div[1]/p")
		private WebElement msg;
		
		
		public void enterMail(String s )  {
			
			WebDriverWait wait = new WebDriverWait(driver, 100);
			WebElement EnterEmail = wait
					.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@data-qa='ftr_inp_field_email']")));
			EnterEmail.sendKeys(s);
		}
		
		public void submit() throws InterruptedException {
			Thread.sleep(5000);
			Submit.click();
		}
		public void validateEmail() {
			String s = msg.getText();
			System.out.println(s);
		}
		
		
		
		

}

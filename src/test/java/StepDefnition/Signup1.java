package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.Singup;
import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup1 extends BaseTest {


	@Given("the user is on the signup page")
	public void the_user_is_on_the_signup_page() throws InterruptedException {
		 initializeBrowser();
		   Singup p = new Singup();
	        p.accountButton();


	}
	@When("the user provides valid first name, last name, email, password, phone number, and captcha")
	public void the_user_provides_valid_first_name_last_name_email_password_phone_number_and_captcha() throws InterruptedException {
		  Singup p = new Singup();
		 p.enterfname("John");
	        p.lastName("Doe");
	        p.enterEmail("john.doe@example.com");
	        p.enterPassword("password123");
	        p.enterPhNo("1234567890");
	        p.cap();
	
		

	}
	@When("clicks the Submit button")
	public void clicks_the_submit_button() throws InterruptedException {
		 Singup p = new Singup();
		 p.Submit();
		

	}
	@Then("the user should be successfully registered")
	public void the_user_should_be_successfully_registered() {
	       teardown();
		
	}

}

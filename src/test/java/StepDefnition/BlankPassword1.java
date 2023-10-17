package StepDefnition;

import PageObject.LoginWithBlankPassword;
import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlankPassword1 extends BaseTest {
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		 initializeBrowser();
		 LoginWithBlankPassword p = new LoginWithBlankPassword();
			p.accBuuton();
	   
	}
	@When("the user enters the email")
	public void the_user_enters_the_email() {
		LoginWithBlankPassword p = new LoginWithBlankPassword();
		p.enterEmail("abcd@gmail.com");
		p.contButton();
	
	}
	@When("the user leaves the password field blank")
	public void the_user_leaves_the_password_field_blank() {
		LoginWithBlankPassword p = new LoginWithBlankPassword();
		p.enterPassword("");
	   
	}
	
	@When("the user submits the form")
	public void the_user_submits_the_form() {
		LoginWithBlankPassword p = new LoginWithBlankPassword();
		p.submit();
	    
	}
	@Then("the system should validate the password field")
	public void the_system_should_validate_the_password_field() {
		LoginWithBlankPassword p = new LoginWithBlankPassword();
		p.validatePassword();
	
	}

}

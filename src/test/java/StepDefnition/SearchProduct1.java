package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import PageObject.SearchProduct;
import Utils.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct1 extends BaseTest {
	WebDriver driver;
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		 initializeBrowser();
	   
	  
	}
	@When("the user searches for a product")
	public void the_user_searches_for_a_product() {
		SearchProduct p = new SearchProduct();
		p.search("shoe");
		
	
	    
	}

	@When("the user selects a product from the search results")
	public void the_user_selects_a_product_from_the_search_results() {
		SearchProduct p = new SearchProduct();
		p.browse();
	   
	}
	@Then("the user should see the details of the selected product")
	public void the_user_should_see_the_details_of_the_selected_product() {
		SearchProduct p = new SearchProduct();
		p.validate();
		 teardown();
	}

}

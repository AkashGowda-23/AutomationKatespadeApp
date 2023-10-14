package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	WebDriver driver;
	
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.katespade.com/");
	  
	}
	@When("the user searches for a product")
	public void the_user_searches_for_a_product() {
		driver.findElement(By.xpath("//div[@class='chakra-input__group css-49u29p']//input[@id='SearchInput']")).sendKeys("shoe");
		
		
	
	    
	}

	@When("the user selects a product from the search results")
	public void the_user_selects_a_product_from_the_search_results() {
		WebDriverWait wait = new WebDriverWait(driver, 100); 
	    WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='cm_icon_search']/child::*[1]")));
		search.click();
	   
	}
	@Then("the user should see the details of the selected product")
	public void the_user_should_see_the_details_of_the_selected_product() {
		WebDriverWait wait = new WebDriverWait(driver, 100); 
	    WebElement Mgs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@name='ResultText']")));
		String s=Mgs.getText();
		System.out.println(s);
		

		String se = "136 results for \"shoe\"";
		String expected = "136 results for \"shoe\"";
		Assert.assertTrue(se.contains(expected));
	
	}

}

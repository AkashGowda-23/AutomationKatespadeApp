package StepDefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Signup {
	WebDriver driver;

	@Given("the user is on the signup page")
	public void the_user_is_on_the_signup_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akash Gowda\\Desktop\\CGI-Automation Testing Core training\\SeleniumWorkspace\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.katespade.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@aria-label='Account']//div[@class='css-1dz76jb']//*[name()='svg']")).click();
		


	}
	@When("the user provides valid first name, last name, email, password, phone number, and captcha")
	public void the_user_provides_valid_first_name_last_name_email_password_phone_number_and_captcha() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='form-control isvalid-fname required validChar']")).sendKeys("Project");
		driver.findElement(By.xpath("//input[@id='registration-form-lname']")).sendKeys("Team5");
		driver.findElement(By.xpath("//input[@class='form-control isvalid-email  required']")).sendKeys("akash.br.1223@gmail.com");
		driver.findElement(By.xpath("//input[@class='isvalid-password form-control']")).sendKeys("Abcd@2345Wet");
		driver.findElement(By.xpath("//input[@class='form-control isvalid-phoneno']")).sendKeys("7645635444");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement captcha = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("//div[@class='recaptcha-checkbox-border']")));
		

        captcha.click();
        driver.switchTo().defaultContent();
	
		

	}
	@When("clicks the Submit button")
	public void clicks_the_submit_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-block g-recaptcha js-verify-account-modal-open']")).click();
		

	}
	@Then("the user should be successfully registered")
	public void the_user_should_be_successfully_registered() {
		
		driver.close();
	}

}

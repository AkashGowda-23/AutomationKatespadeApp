package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.BaseTest;

public class AddProductToCart extends BaseTest {

	public AddProductToCart() {
		PageFactory.initElements(super.driver, this);
	}


	@FindBy(xpath = "//div[@class='chakra-input__group css-49u29p']//input[@id='SearchInput']")
	private WebElement Searchtbutton;

	@FindBy(xpath = "//div[@data-qa='cm_icon_search']/child::*[1]")
	private WebElement search;
	
	@FindBy(xpath = "//img[@alt='Heart Of Gold Idiom Bangle']")
	private WebElement clickonprod;
	
	@FindBy(xpath = "//button[@id='add-to-cart']")
	private WebElement Addtocart;
	
	@FindBy(xpath = "//button[normalize-space()='View shopping bag']")
	private WebElement viewcart;
	
	@FindBy(xpath = "//a[@data-qa='sb_link_pdtname']")
	private WebElement gettext;


	public void search(String s) {
		Searchtbutton.sendKeys(s);

	}

	public void browse() {

		WebDriverWait wait = new WebDriverWait(driver, 100); 
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='cm_icon_search']/child::*[1]")));
		search.click();
	}
	
	public void click()  {
		WebDriverWait wait = new WebDriverWait(driver, 100); 
		WebElement clickonprod = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Heart Of Gold Idiom Bangle']")));
		
		clickonprod.click();
	}
	
	public void add() throws InterruptedException {
		Thread.sleep(7000);
		Addtocart.click();
		
	}
	
	public void view() throws InterruptedException {
		Thread.sleep(5000);
		viewcart.click();
		
	}
	
	public void validatetheproduct () throws InterruptedException {
		Thread.sleep(5000);
		String s =gettext.getText();
		System.out.println(s);
		Assert.assertEquals(s, "Heart Of Gold Idiom Bangle");

	}



}

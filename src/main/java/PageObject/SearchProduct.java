package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.BaseTest;

public class SearchProduct extends BaseTest {

	public SearchProduct() {
		PageFactory.initElements(super.driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='chakra-input__group css-49u29p']//input[@id='SearchInput']")
	private WebElement Searchtbutton;
	
	@FindBy(xpath = "//p[@name='ResultText']")
	private WebElement Mgs;
	
	@FindBy(xpath = "//div[@data-qa='cm_icon_search']/child::*[1]")
	private WebElement search;
	
	
	
	public void search(String s) {
		Searchtbutton.sendKeys(s);
		
	}
	public void browse() {
		
		WebDriverWait wait = new WebDriverWait(driver, 100); 
	    WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-qa='cm_icon_search']/child::*[1]")));
		search.click();
	}
	
	public void  validate() {
		WebDriverWait wait = new WebDriverWait(driver, 100); 
	    WebElement Mgs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[@name='ResultText']")));
		String s=Mgs.getText();
		System.out.println(s);
		

		String se = "136 results for \"shoe\"";
		String expected = "136 results for \"shoe\"";
		Assert.assertTrue(se.contains(expected));

		
	}
	
	
	
	

}

package PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BaseTest;

public class SearchStore extends BaseTest {

	public SearchStore() {
		PageFactory.initElements(super.driver, this);
	}
	
	@FindBy(xpath = "//p[@class='chakra-text css-1kzi50a']")
	private WebElement Searchstore;
	
	@FindBy(xpath = "//input[@class='search-input Locator-input js-locator-input']")
	private WebElement entertext;
	
	@FindBy(xpath = "//div[normalize-space()='World Trade Center']")
	private WebElement Msg;
	
	@FindBy(xpath = "//button[@class='search-button Locator-button Locator-button--search']")
	private WebElement button;
	
	
	
	public void searchthestore() {
		Searchstore.click();
		
		
	}
	public void Entertext(String s) {
		entertext.sendKeys(s);
		
		
	}
	
	public void butt() {
		button.click();
	}
	
	public void validate() {
		String s=Msg.getText();
		System.out.println(s);
		Assert.assertEquals(s,"World Trade Center");
		
	}
	
	
	
	
	
	
	

}

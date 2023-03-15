package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	@FindBy(name="searchbar")
	WebElement searchBox;
	
	@FindBy(id="button-search")
	WebElement srchBtn;
	
	@FindBy(id="login")
	WebElement loginBtn;
	
	@FindBy(id="signup")
	WebElement signupBtn;
	
	@FindBy(id="cart")
	WebElement viewCartBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public SearchResultPage searchItem(String name)
	{
		searchBox.sendKeys(name);
		srchBtn.click();
		return new SearchResultPage();
	}
}

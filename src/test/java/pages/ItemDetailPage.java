package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class ItemDetailPage extends TestBase {

	@FindBy(css="div.detail-wrapper button.call-to-action")
	WebElement addToCartBtn;
	
	public ItemDetailPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CartPage addItemToCart()
	{
		addToCartBtn.click();
		return new CartPage();
	}
	
}

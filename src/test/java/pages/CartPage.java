package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CartPage extends TestBase{

	@FindBy(xpath="(//button[@class='call-to-action'])[2]")
	WebElement chekOutBtn;
	
	@FindBy(css="div.cart ul")
	WebElement cartItem;
	
	@FindBy(id="billing-coupon")
	WebElement couponChk;
	
	@FindBy(id="coupon")
	WebElement couponTxt;
	
	@FindBy(xpath="//button[conatins(text(), 'Apply')]")
	WebElement applyBtn;
	
	@FindBy(xpath="//button[conatins(text(), 'Check')]")
	WebElement chkOutBtn;
	
	@FindBy(xpath="//button[conatins(text(), 'Empty')]")
	WebElement emptyBtn;
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public CheckoutPage checkOutInCart()
	{
		chekOutBtn.click();
		return new CheckoutPage();
	}
}

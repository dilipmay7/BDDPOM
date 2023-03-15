package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class CheckoutPage extends TestBase {


	@FindBy(xpath="(//button[@class='call-to-action'])[2]")
	WebElement buyBtn;
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void finalbuy()
	{
		buyBtn.click();
	}
	
}

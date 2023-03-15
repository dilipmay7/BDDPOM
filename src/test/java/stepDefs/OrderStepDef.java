package stepDefs;

import static org.testng.Assert.assertTrue;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ItemDetailPage;
import pages.SearchResultPage;

public class OrderStepDef extends TestBase{
	HomePage  homePage;
	SearchResultPage resultPage;
	ItemDetailPage itemDetailsPage;
	CartPage cartPage;
	CheckoutPage finalpage;
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		initialize();

	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) {
		homePage=new HomePage();
		resultPage = homePage.searchItem(strItem);
	
	}

	@Given("Item must be displayed")
	public void item_must_be_displayed() {
		//resultPage= new SearchResultPage();
	boolean isDispl=resultPage.isItemDisplayed();
		assertTrue(isDispl);
		resultPage.selectItem();

	}
	@When("User Add Item to Cart")
	public void user_add_item_to_cart() {
		itemDetailsPage=new ItemDetailPage();
		//itemDetailsPage.addItemToCart();
		cartPage=itemDetailsPage.addItemToCart();
	}
	@Then("Item must be listed in cart")
	public void item_must_be_listed_in_cart() {

		finalpage=cartPage.checkOutInCart();
		finalpage.finalbuy();
	}
	
}

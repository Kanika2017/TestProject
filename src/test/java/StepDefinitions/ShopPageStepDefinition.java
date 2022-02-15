package StepDefinitions;

import Pages.ShopPage;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class ShopPageStepDefinition {

	ShopPage shopPage = new ShopPage();

	@Then("^I click on buy button of \"([^\"]*)\" number of times (\\d+)$")
	public void Click_On_Buy_Button_Of_An_Item(String itemName, int numberOftimes) {
		for (int i = 1; i <= numberOftimes; i++) {
			shopPage.ClickOnBuyButtonOfAnItem(itemName);
		}
	}
	
	@Then("^I verify products added to the cart are (\\d+)$")
	public void verify_Number_Of_Products_In_The_Cart(int numberOfProducts) {
		Assert.assertEquals(shopPage.VerifyNumberOfItemsInCart(),numberOfProducts);
	}
	

	@Then("^I verify Row number (\\d+) contains \"([^\"]*)\" having quantity \"([^\"]*)\"$")
	public void verify_Number_Of_Items_Per_product(int rowNumber, String ItemName, String quantity) {
		Assert.assertEquals(shopPage.VerifyQuantityPerItem(rowNumber, ItemName),quantity);
	}
}

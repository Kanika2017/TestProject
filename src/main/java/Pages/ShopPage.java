package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShopPage extends DriverFactory {

	public void ClickOnBuyButtonOfAnItem(String Item) {
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'products')]//ul/li//div//h4"));
		for (WebElement element : ele) {
			if (element.getText().equals(Item)) {
				element.findElement(By.xpath("//h4[text()='" + Item + "']//..//p//a")).click();
				break;
			}
		}
	}

	public int VerifyNumberOfItemsInCart() {
		List<WebElement> li = driver.findElements(By.xpath("//table[contains(@class, 'cart-items')]//tbody/tr"));
		return li.size();
	}

	public String VerifyQuantityPerItem(int rowNumber, String ItemName) {
		return driver
				.findElement(By.xpath(
						"//table[contains(@class, 'cart-items')]//tbody/tr[" + rowNumber + "]//td[contains(text(),'"
								+ ItemName + "')]/following-sibling::td/following-sibling::td//input"))
				.getAttribute("value");

	}
}
